package sunbeam.Q4;

public class Queue {
	int front,rear;
	int arr[];
	private final int SIZE;
	
	public Queue(int Size) {
		SIZE = Size;
		arr= new int[SIZE];
		rear = front = 0;
	}
	public void push(int value) {
		rear++;
		arr[rear]=value;
	}
	public int pop() {
		int temp = arr[front+1];
		front++;
		return temp;
	}
	public int peek() {
		return arr[front+1];
	}
	public boolean isEmpty() {
		return rear==front;
	}
	public boolean isFull() {
		return rear == SIZE-1;
	}
	

}
