package Q1;

import java.util.Arrays;

public class HeapSortMain {

	public static void main(String[] args) {
		int arr[]= {0,6,14,3,26,8,18,21,9,5};
		HeapSort h = new HeapSort();
		System.out.println("Array before sort : "+Arrays.toString(arr));
		
		h.heapSort(arr);
		
		System.out.println("Array after sort : "+Arrays.toString(arr));

		
	}

}
