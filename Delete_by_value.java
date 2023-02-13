package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Delete_by_value {
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
		
		System.out.println("Enter the number which is deleted");
		int val=sc.nextInt();
		int count=0;
		
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]==val) {
			for(int j=i;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			count++;
			break;
			
		}
		
	}
	
	if(count==0) {
		System.out.println("Element is not found");
	}else {
		System.out.println("element delete sucessfully");
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
		
	}

}
