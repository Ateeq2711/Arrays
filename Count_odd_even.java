package Array;

import java.util.Scanner;

public class Count_odd_even {
	public static void main(String[] args) {
		System.out.println("Enter size of the Array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double []arr=new double[n];
		int even=0;
		int odd=0;
		System.out.println("Enter the Element");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) {
				even++;
			}else {
				odd++;
			}
			
		}
		System.out.println("Number of even : "+even);
		System.out.println("Number of odd : "+odd);
	}

}
