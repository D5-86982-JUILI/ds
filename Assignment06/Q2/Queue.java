package Q2;

public class Queue {
	private Heap h;
	public Queue(int size) {
		h = new Heap(size);
	}
	
	
//	public void pushMax(int value) {
//		h.addHeapByMax(value);
//	}
	
	
	public void pushMin(int value) {
		h.addHeapByMin(value);
	}
	
	
//	public int popMax() {
//		return h.deleteHeapByMax();
//		
//	}
	
	
	public int popMin() {
		return h.deleteHeapByMin();
		
	}
	
	
	public int peek() {
		return h.getMin();
	}
	
	
	public boolean isEmpty() {
		return h.isEmpty();

	}
	
	
	public boolean isFull() {
		return h.isFull();
	}

}
