package com.sunbeam.Q6;

import java.util.Scanner;

public class NthOccurance {
	
	public static int nthOccurance(int arr[],int key,int c)
	{
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				count++;
				if(count==c)
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key = ");
		int key;
		key = sc.nextInt();
		System.out.println("Enter the occurance = ");
		int count;
		count = sc.nextInt();
		
		int res = nthOccurance(arr, key,count);
		if(res==-1) {
			System.out.println("Key not found !!");
		}
		System.out.println("Key found at "+res);
	}

}
