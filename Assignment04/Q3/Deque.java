package sunbeam.Q3;

public class Deque {
    static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int value) {
            data = value;
            prev = next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public Deque() {
        head = tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // Insert at the front
    public void addFront(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Insert at the rear
    public void addRear(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Remove from the front
    public int removeFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return -1;
        }
        int value = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        return value;
    }

    // Remove from the rear
    public int removeRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return -1;
        }
        int value = tail.data;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        size--;
        return value;
    }

    // Display the deque from front to rear
    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "  ");
            current = current.next;
        }
        System.out.println();
    }

    // Display the deque from rear to front
    public void displayReverse() {
        if (isEmpty()) {
            System.out.println("Deque is empty!");
            return;
        }
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + "  ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.addFront(10);
        deque.addRear(20);
        deque.addFront(30);
        deque.addRear(40);

        System.out.println("Deque from front to rear:");
        deque.display();

        System.out.println("Deque from rear to front:");
        deque.displayReverse();

        System.out.println("Removed from front: " + deque.removeFront());
        System.out.println("Removed from rear: " + deque.removeRear());

        System.out.println("Deque after removals:");
        deque.display();
    }
}
