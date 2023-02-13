package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Count_prime_number {
	public static void main(String[] args) {
		System.out.println("Size of the array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("the given array :" +Arrays.toString(arr));
		
		
		int num=0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=2;j<=arr[i]/2;j++) {
				if(arr[i]%j==0) {
					count++;
				}
				
			}
			if (count==0){
				num++;
				}
			
		}
		System.out.println(num);
		
	}

}
