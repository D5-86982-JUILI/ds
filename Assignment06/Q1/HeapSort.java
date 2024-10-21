package Q1;

public class HeapSort {
	//private int arr[];
	private int SIZE;
	public HeapSort() {
		//arr=new int[size +1];
		SIZE = 0;
	}
	
	public int getMin(int arr[]) {
		return arr[1];
	}
	
	public void addHeapByMin(int arr[]) {
		SIZE++;
//		arr[SIZE]=value;
		int ci = SIZE;
		int pi = ci/2;
		while(pi>=1) {
			if(arr[pi]<arr[ci]) {
				break;
			}
			else {
				int temp = arr[pi];
				arr[pi]=arr[ci];
				arr[ci]=temp;
			}
			ci = pi;
			pi = ci/2;
				
		}
	}
//	public void addHeapByMax(int value) {
//		SIZE++;
//		arr[SIZE]=value;
//		int ci = SIZE;
//		int pi = ci/2;
//		while(pi>=1) {
//			if(arr[pi]>arr[ci]) {
//				break;
//			}
//			else {
//				int temp = arr[pi];
//				arr[pi]=arr[ci];
//				arr[ci]=temp;
//			}
//			ci = pi;
//			pi = ci/2;
//				
//		}
//	}
	
	
	public int deleteHeapByMin(int arr[]) {
		int min= arr[1];
		arr[1] = arr[SIZE];
		arr[SIZE]=min;
		SIZE--;
		int pi = 1;
		int ci = pi*2;
		while(ci<=SIZE) {
			if((ci+1)<=SIZE && arr[ci+1]<arr[ci]) {
				ci=ci+1;
			}
			if(arr[ci]>arr[pi]) {
				break;
			}
			int temp = arr[pi];
			arr[pi]=arr[ci];
			arr[ci]= temp;
			pi=ci;
			ci=pi*2;
		}
		
		return min;
	}
//	public int deleteHeapByMax() {
//		int max = arr[1];
//		arr[1] = arr[SIZE];
//		SIZE--;
//		int pi = 1;
//		int ci = pi*2;
//		while(ci<=SIZE) {
//			if((ci+1)<=SIZE && arr[ci+1]>arr[ci]) {
//				ci=ci+1;
//			}
//			if(arr[ci]<arr[pi]) {
//				break;
//			}
//			int temp = arr[pi];
//			arr[pi]=arr[ci];
//			arr[ci]= temp;
//			pi=ci;
//			ci=pi*2;
//		}
//		
//		return max;
//	}

	
		public void heapSort(int arr[]) {
			for(int i =1; i<arr.length;i++) {
				addHeapByMin(arr);
			}
			for(int i = 1 ; i<arr.length;i++) {
				deleteHeapByMin(arr);
			}
		}
}
