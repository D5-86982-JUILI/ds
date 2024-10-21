package Q2;

public class Heap {
	private int arr[];
	private int SIZE;
	public Heap(int size) {
		arr=new int[size +1];
		SIZE = 0;
	}
	public boolean isEmpty() {
		return SIZE == 0;
	}
	public boolean isFull() {
		return SIZE == arr.length -1;
	}
	public int getMin() {
		return arr[1];
	}
	
	public void addHeapByMin(int value) {
		SIZE++;
		arr[SIZE]=value;
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
	
	
	public int deleteHeapByMin() {
		int min = arr[1];
		arr[1] = arr[SIZE];
		SIZE--;
		int pi = 1;
		int ci = pi*2;
		while(ci<=SIZE) {
			if((ci+1)<=SIZE && arr[ci+1]<arr[ci]) {
				ci=ci+1;
			}
			if(arr[ci]<arr[pi]) {
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
}
