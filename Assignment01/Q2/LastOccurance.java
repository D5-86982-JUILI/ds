package com.sunbeam.Q2;

public class LastOccurance {
    public static int findLastOccurrence(int[] arr, int key) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 7, 3, 9};
        int key = 3;
        int lastIndex = findLastOccurrence(arr, key);
        System.out.println("The last occurrence of " + key + " is at index: " + lastIndex);
    }
}
