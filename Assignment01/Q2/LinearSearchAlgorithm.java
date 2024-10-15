package com.sunbeam.Q2;

import java.util.Scanner;

public class LinearSearchAlgorithm {
	
	public static int LinearSearch(int arr[],int Key) {
		for(int i = 0;i<arr.length;i++) {
			if(Key==arr[i])
				return i;
				
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {11,65,87,99,41,25,32,17};
		
		
		System.out.println("Enter the element to search = ");
		Scanner sc = new Scanner (System.in);
		int Key = sc.nextInt();
		int index = LinearSearch(arr, Key);
		if(index==-1)
			System.out.println("Key not found");
		else 
			System.out.println("Key found at index = "+index);
		
		
	}

}
