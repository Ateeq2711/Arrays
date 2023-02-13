package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Delete_by_index {
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
		
		System.out.println("Enter the index number");
		int index=sc.nextInt();
		index=index-1;
		int count=0;
		
	for(int i=0;i<arr.length;i++) {
		
		if(i==index) {
			for(int j=i;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			count++;
			break;
			
		}
		
	}
	
	if(count==0) {
		System.out.println("please enter the index number < "+arr.length);
	}else {
		System.out.println("element delete sucessfully");
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
		
	}

}
