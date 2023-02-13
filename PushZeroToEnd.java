package Array;

public class PushZeroToEnd {
	public static void main(String[] args) {
		int arr[] = {3, 5, 0, 0, 4};
		int n=arr.length;
		int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        while(count<n){
          arr[count]=0;
          count++;
        }
        
        
         for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
         }
	}

}
