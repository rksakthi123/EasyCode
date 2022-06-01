import java.util.ArrayList;
import java.util.List;

public class DynamicProgramInteger {
	
	//fibonacciNumberSeries
	//fibonacciRecursion
	//sumOfTwo in array
	//factorial
	
	
	public static void main(String args[]) {
		DynamicProgramInteger obj=new DynamicProgramInteger();
		//obj.fibonacciNumberSeries();
		//obj.sumOfTwo(new int[]{2,1,7,4,5,9},9);
		obj.checkPrimeNumber();
	}
	
	public void missingNumber() {
		int[] numbers= {1,2,3,4,5,6,7,8,10};
	}
	
	public void fibonacciNumberSeries() {
		//0,1,1,2,3,5,8,13,21,34,55,89
		int n=100;
		int f0=0,f1=1,f2=0;
		List<Integer> listFibonacciSeries=new ArrayList<Integer>();
		listFibonacciSeries.add(f0);
		listFibonacciSeries.add(f1);
		while(f2<n) {
			f2=f0+f1;
			f0=f1;
			f1=f2;
			if(f2<100) {
			listFibonacciSeries.add(f2);
			}
		}
		System.out.println(listFibonacciSeries);
	}
	
	public void checkPrimeNumber() {
		int input=11;
		int i=2;
		while(i<=input/2) {
			if(input%i==0) {
				System.out.println("Not a prime number");
				return;
			}
			i++;
		}
		System.out.println("Prime number");
	}
	
	public int fibonacci(int n) {
		if(n<=1)
			return n;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}
	
	public void sumOfTwo(int numbers[],int sumValue) {
		for(int i=0;i<numbers.length;i++) {
			for(int j=i;j<numbers.length;j++){
				if(numbers[i]+numbers[j]==sumValue) {
					System.out.println(numbers[i]+","+numbers[j]);
				}
			}
		}
	}
	
	public int factorial(int n) {
		if(n==1)
			return n;
		else
			return n*factorial(n-1);
	}

}
