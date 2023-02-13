package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Combine_two_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr1 = readArray(1);
		int[] arr2 = readArray(2);
		int[] com = combine(arr1,arr2);
		display(com);
	}
	
	static int[] readArray(int x) {
		System.out.println("Size of the array "+x);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter the elements of Array "+x);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("the given array "+x+": " +Arrays.toString(arr));
		return arr;
	}
	
	static int[] combine(int []arr1,int []arr2) {
		int l1=arr1.length;
		int l2=arr2.length;
		int []com=new int[l1+l2];
		for(int i=0;i<l1;i++) {
			com[i]=arr1[i];
		}
		for(int i=0;i<l2;i++) {
			com[l1+i]=arr2[i];
		}
		return com;
		
	}
	
	static void display(int [] com) {
		System.out.println("combine array :");
		for(int i:com) {
			System.out.print(i+" ");
		}
	}
	
}
