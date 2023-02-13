package Array;

import java.util.Arrays;

public class Second_highest_number {
	public static void main(String[] args) {
		int [] num= {2,9,6,7,3,4};
		Arrays.sort(num);
		System.out.println(num[num.length-2]);
	}

}
