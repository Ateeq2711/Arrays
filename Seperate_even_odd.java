package Array;

//Segregate even and odd numbers 

public class Seperate_even_odd {
	
	static void seperate(int []arr,int n) {
		int z=0;
		
		
		int []temp=new int[n];
		
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				temp[z]=arr[i];
				z++;
			}
		}
		
		
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				temp[z]=arr[i];
				z++;
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(temp[i]+" ");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		 int arr[] = { 1, 3, 2, 4, 7, 6, 9, 10 };
		 int n=arr.length;
		 seperate(arr, n);
		 
	}

}
