package com.sunbeam.Q5;

import java.util.Scanner;

public class Descending {
	public static int binarySearch(int arr[], int key) {
        int left = 0;
        int right = arr.length - 1;
        int comparison = 0; 

        while (left <= right) {
            int mid = (left +right) / 2;
            comparison++; 
            
            if (key == arr[mid]) { 
                System.out.println("Comparisons (Binary Search) = " + comparison);
                return mid;
            } else if (key > arr[mid]) { 
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Number of comparisons (Binary Search) = " + comparison);
        return -1; 
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= {99,88,77,66,55,44,33};
		System.out.println("Enter the key to search = ");
        int key = sc.nextInt();

        int index = binarySearch(arr, key);
        if (index == -1) {
            System.out.println("KEY NOT FOUND!!");
        } else {
            System.out.println("KEY FOUND AT INDEX = " + index);
        }
		
	}


}
