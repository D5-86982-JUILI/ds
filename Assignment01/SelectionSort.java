package com.sunbeam.Q9;

import java.util.Arrays;

public class SelectionSort {
	public static int Selectionsort(int arr[]) {
		int c=0;
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			c++;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					 temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
			}
		}
		return c;
	}
	public static void main(String[] args) {
		int arr[]= {10,20,50,8,12};
		int c = Selectionsort(arr);
		System.out.println("Sorted array = "+Arrays.toString(arr));
		System.out.println("Number of comparison = "+c);
	}

}
