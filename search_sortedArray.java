package Array;

public class search_sortedArray {
	
	static int  binarySearch(int[]arr,int low,int high,int key) {
		int mid=(low+high)/2;
		if(key==arr[mid]) {
			return mid;
		}
		
		if(key>arr[mid]) {
			return binarySearch(arr, mid+1, high, key);
		}
		return binarySearch(arr, low, mid-1, key);
	}
	
	
	public static void main(String[] args) {
		int arr[]= {5,6,7,8,9,10};
		int n,key;
		n=arr.length-1;
		key=6;
		System.out.println("Index : "+binarySearch(arr, 0, n, key));
		
		}
	}


