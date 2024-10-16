package sunbeam.Q1;

import java.util.Arrays;

public class Program01 {
	
	public static int Insertion(int arr[],int n) {
		int c=0;
		for(int i=0;i<n;i++) {
			c++;
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
		
				arr[j+1] = arr[j];
				j--;
				
			}
			arr[j+1]=temp;
			
		}
		return c;
	}
	public static void main(String[] args) {
		int arr[]= {55,44,22,66,11,33,99};
		System.out.println("Array before sort = "+Arrays.toString(arr));
		 Insertion(arr, arr.length);
		System.out.println("Array after sort = "+Arrays.toString(arr));
		int count = Insertion(arr, arr.length);
		System.out.println("Comparison = "+count);
		
		
	}

}
