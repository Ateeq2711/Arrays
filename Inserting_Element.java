package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Inserting_Element {
public static void main(String[] args) {

	System.out.println("Size of the array");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []arr=new int[n];
	System.out.println("Enter the elements");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	
	System.out.println("the given arrar :" +Arrays.toString(arr));
	
	System.out.println("Enter the value which is insert into given array");
	int val=sc.nextInt();
	System.out.println("Enter the Index Number");
	int index=sc.nextInt();
	
	int []newarr=new int[n+1];
	for(int i=0;i<index;i++) {
		newarr[i]=arr[i];
	}
	newarr[index]=val;
	for(int i=(n-1);i>=index;i--) {
		newarr[i+1]=arr[i];
	}
	
	System.out.println("the " +val+" is inserted into "+index+" position :"+Arrays.toString(newarr));
	
	
		
		
	}

}
