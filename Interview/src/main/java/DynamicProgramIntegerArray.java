import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

public class DynamicProgramIntegerArray {
	// reArrangIntegerArray
	public static void main(String[] args) {
		DynamicProgramIntegerArray obj = new DynamicProgramIntegerArray();
		obj.nextGreaterNumber();

	}

	public void maxSumArrayNoAdjacentNumbers() {
		int[] numbers = { 3, 2, 5, 10, 17, 46 };
		Map<String, Integer> mapSum = new HashMap<String, Integer>();
		String key = "";
		int max = 0, sum = 0;
		for (int i = 0; i < numbers.length - 2; i++) {

			int k = 2;
			while (k < numbers.length) {
				key = key + "," + numbers[i];
				sum = numbers[i];
				for (int j = i + k; j < numbers.length; j = j + 2) {
					sum = sum + numbers[j];
					key = key + "," + numbers[j];
				}
				key = key.substring(1);
				mapSum.put(key, sum);
				key = "";
				k++;
			}
		}
		System.out.println(mapSum);
	}

	public void nextGreaterNumber() {
		int[] numbers = { 65, 40, 50, 7, 6, 51, 16 };
		int next = 0;
		boolean flag = false;
		for (int i = 0; i < numbers.length; i++) {
			next = -1;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					next = numbers[j];
					break;
				}
			}
			System.out.println(numbers[i] + "-> " + next);
		}
	}

	public void stockSpanProblem() {
		int[] stocks = { 31, 27, 14, 21, 30, 22 };
		int count = 0;
		for (int i = 0; i < stocks.length; i++) {
			if (i == 0) {
				System.out.print(1 + "  ");
			} else {
				count = 1;
				int j = i - 1;
				while (j >= 0) {
					if (stocks[i] > stocks[j]) {
						count++;

					} else {
						break;
					}
					j--;
				}
				System.out.print(count + "  ");
			}

		}

	}

	public void matrixRotation() {
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6},{7,8,9} };
		int rowCount = array.length;
		int colCount = array[0].length;
		for (int i = colCount - 1; i >= 0; i--) {
			for (int j = 0; j < rowCount; j++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println();
		}
	}

	public void reArrangIntegerArray() {
		// input {9,-5,7,0,-2,-1,8,-7}
		// output {9,7,0,8,-5,-2,-1,-7}
		int[] array = { 9, -5, 7, 0, -2, -1, 8, -7 };
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[j - 1] < 0 && array[j] >= 0) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}

		for (int a : array) {
			System.out.println(a);
		}
	}

	public void maxSumOfTwoArrayElementsIn6Directions() {
		int[] array1 = { 5, 3, 8, 1, 4, 2 };
		int[] array2 = { 8, 1, 6, 3, 9, 2 };
		int sum1array1 = 0, sum2Array1 = 0;
		int sumArray1 = 0, sumArray2 = 0;
		int sum1array2 = 0, sum2Array2 = 0;
		Map<String, Integer> mapSumArray = new HashMap<String, Integer>();
		for (int i = 0; i < array1.length; i++) {
			if (i < array1.length / 2) {
				sum1array1 = sum1array1 + array1[i];
			} else {
				sum2Array1 = sum2Array1 + array1[i];
			}
			sumArray1 = sumArray1 + array1[i];

		}
		mapSumArray.put("sumArray1", sumArray1);
		for (int i = 0; i < array2.length; i++) {
			if (i < array2.length / 2) {
				sum1array2 = sum1array2 + array2[i];
			} else {
				sum2Array2 = sum2Array2 + array2[i];
			}
			sumArray2 = sumArray2 + array2[i];

		}
		mapSumArray.put("sumArray2", sumArray2);
		mapSumArray.put("sumArray11Array21", sum1array1 + sum1array2);
		mapSumArray.put("sumArray11Array22", sum1array1 + sum2Array2);
		mapSumArray.put("sumArray12Array22", sum2Array1 + sum2Array2);
		mapSumArray.put("sumArray12Array21", sum2Array1 + sum1array2);
		int max = 0;
		String mapSumValue = "";
		for (Map.Entry<String, Integer> entry : mapSumArray.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				mapSumValue = entry.getKey();

			}
		}
		System.out.println("Max value path is:" + mapSumValue + " and value:" + max);

	}

}
