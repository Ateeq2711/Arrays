package Array;

public class Array_Rotation {
	
	static void leftRotate(int []arr,int n ,int d) {
		if(d==0) {
			return;
		}
			d=d%n;
			
			reverseArray(arr,0,d-1);
			reverseArray(arr,d,n-1);
			reverseArray(arr,0,n-1);
	}
	
	static void reverseArray(int []arr,int first,int last) {
		int tem;
		while(first<last) {
			int temp=arr[last];
			arr[last]=arr[first];
			arr[first]=temp;
			first++;
			last--;
		}
	}
	
	static void display(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int d = 2;
        display(arr);
        leftRotate(arr, n, d);
        System.out.println("After rotate");
        display(arr);
	}

}
