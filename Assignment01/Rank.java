package com.sunbeam.Q8;

import java.util.Arrays;
import java.util.Scanner;

public class Rank {
	public static int rank(int arr[],int n) {
		int r=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=n)
				r++;
			
			
		}
		return r;
	}
	public static void main(String[] args) {
		int arr[]=  { 10, 20, 15, 3, 4, 4, 1 } ;
		System.out.println("Array = "+Arrays.toString(arr));
		System.out.println("Enter any number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Rank of the element = "+rank(arr, n));
	}

}
