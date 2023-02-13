package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_element {
	public static void main(String[] args) {
		int []num= {4,5,6,7,8,9};
		
		
		for(int i=num.length-1;i>=0;i--) {
			System.out.print(num[i]);
		}
		System.out.println();
		
		String []s= {"a","b","c","d"};
		List<String> list = Arrays.asList(s);
		Collections.reverse(list);
		System.out.println(list);
	}

}
