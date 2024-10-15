package com.sunbeam.Q3;

import java.util.Scanner;

public class ComparisonLinear {
    public static int comparison(int arr[], int key) {
        int comparisonCount = 0;
        for (int i = 0; i < arr.length; i++) {
            comparisonCount++; 
            if (key == arr[i]) {
                System.out.println("Comparisons (Linear Search) = " + comparisonCount);
                return i; 
            }
        }
        System.out.println("Comparisons (Linear Search) = " + comparisonCount); 
        return -1;
    }
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
            } else if (key < arr[mid]) {
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
        int arr[] = {11, 85, 97, 42, 65, 33, 65};
        System.out.println("Enter the key to find its index = ");
        int key = sc.nextInt();
        System.out.println("Comparison by = "+comparison(arr, key));
        System.out.println("Comparison by binary = "+binarySearch(arr, key));
        int index = comparison(arr, key);
        if (index == -1) {
            System.out.println("KEY NOT FOUND");
        } else {
            System.out.println("KEY FOUND AT INDEX = " + index);
        }
}
}
