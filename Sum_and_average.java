package Array;

import java.util.Scanner;

public class Sum_and_average {
	public static void main(String[] args) {
		System.out.println("Enter size of the Array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double []arr=new double[n];
		double sum=0;
		System.out.println("Enter the Element");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("sum of the array is : "+sum );
		System.out.println("Average of the Array is: "+sum/n);
				
	}

}
