import java.util.ArrayList;
import java.util.List;

public class DynamicProgramInteger {
	
	public static void main(String args[]) {
		DynamicProgramInteger obj=new DynamicProgramInteger();
		//obj.fibonacciNumberSeries();
		obj.sumOfTwo(new int[]{2,1,7,4,5,9},9);
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
	
	public void sumOfTwo(int numbers[],int sumValue) {
		for(int i=0;i<numbers.length;i++) {
			for(int j=i;j<numbers.length;j++){
				if(numbers[i]+numbers[j]==sumValue) {
					System.out.println(numbers[i]+","+numbers[j]);
				}
			}
		}
	}

}
