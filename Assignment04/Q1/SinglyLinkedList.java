package sunbeam.Q1;

public class SinglyLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int value) {
            data = value;
            next = null;
        }
    }

    private Node tail;
    private int size;

    public SinglyLinkedList() {
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (tail == null) { 
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        Node trav = tail.next; // Starting from the head
        do {
            System.out.print(trav.data + "  ");
            trav = trav.next;
        } while (trav != tail.next);
        
    }

    public void remove(int value) {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        Node trav = tail.next;
        Node prev = tail;
        do {
            if (trav.data == value) {
                if (trav == tail) { 
                    if (tail == tail.next) { 
                        tail = null;
                    } else {
                        prev.next = trav.next;
                        tail = prev;
                    }
                } else {
                    prev.next = trav.next;
                }
                size--;
                return;
            }
            prev = trav;
            trav = trav.next;
        } while (trav != tail.next);
        System.out.println("Element " + value + " not found!");
    }

    public static void main(String[] args) {
    	SinglyLinkedList list = new SinglyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("List:");
        list.display();

        list.remove(30);
        System.out.println();
        System.out.println("After removing 30:");
        list.display();

        list.remove(40);
        System.out.println();
        System.out.println("After removing 40:");
        list.display();

        list.remove(10);
        list.remove(20);
        System.out.println();
        System.out.println("After removing all elements:");
        list.display();
    }
}
