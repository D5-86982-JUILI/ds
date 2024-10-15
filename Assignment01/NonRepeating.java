package com.sunbeam.Q7;

public class NonRepeating {
	public static void main(String[] args) {
		int arr[]={ 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
		int f = -1;
		int res=0;
		for(int i = 0;i<arr.length;i++) {
			f=-1;
			for(int j =0;j<arr.length;j++) {
				if(arr[i]==arr[j]&&i!=j) {
					f=1;	 
				}
				
				
			}
			if(f==-1) {
				System.out.println("Element found "+arr[i]);
			}
			
		}
		
	}
	
	}


