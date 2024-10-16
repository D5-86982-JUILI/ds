package sunbeam.Q8;

public class CircularQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int count;
    private final int SIZE;

    public CircularQueue(int size) {
        SIZE = size;
        arr = new int[SIZE];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear + 1) % SIZE;
        arr[rear] = value;
        count++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1; 
        }
        int temp = arr[front];
        front = (front + 1) % SIZE;
        count--;
        return temp;
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public boolean isFull() {
        return (count == SIZE);
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        int i = front;
        for (int c = 0; c < count; c++) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % SIZE;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.push(50);
        queue.push(60);

        queue.pop();
        queue.peek();

//        queue.push(60);
//        queue.peek();

        System.out.println("Front item is: " + queue.arr[queue.front]);
        System.out.println("Queue size is: " + queue.count);
    }
}
