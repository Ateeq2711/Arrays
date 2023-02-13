package Array;

import java.util.HashSet;

public class Intersection_of_Array {
	public static void main(String[] args) {
		int[]num1= {5,6,7,8};
		int []num2= {5,9,1,8};
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<num1.length;i++) {
			set.add(num1[i]);
		}
		for(int i=0;i<num2.length;i++) {
			if(set.contains(num2[i])) {
				System.out.println("Intersection Numbers :  "+num2[i]);
			}
		}
	}

}
