package Array;

public class Find_three_higest_number {
	public static void main(String[] args) {
		 int []arr={5,6,1,9,2,3,7};
		 int first,second,third;
		 first=second=third=0;
		 for(int i=0;i<arr.length;i++) {
			 if(first<arr[i]) {
				 third=second;
				 second=first;
				 first=arr[i];
			 }else if(second<arr[i]) {
				 third=second;
				 second=arr[i];
			 }else if(third<arr[i]) {
				 third=arr[i];
			 }
		 }
		 System.out.println(first+" "+second+" "+third);
	}

}
