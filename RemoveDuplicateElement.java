package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveDuplicateElement {
	
	public static void main(String[] args) {
		
		System.out.println("Size of the array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("the given Array is : ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		System.out.print("Array after deleting duplicate element : ");
		Iterator<Integer> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		
		
	}

}
