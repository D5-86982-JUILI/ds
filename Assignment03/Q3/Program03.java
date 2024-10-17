package sunbeam.Q3;

public class Program03 {
    static class Node {
        int data;
        Node next;

        public Node(int value) {
            data = value;
            next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public Program03() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFromHead(int value) {
        Node newnode = new Node(value);
        if (isEmpty()) {
            head = tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
        size++;
    }

    public void addFromTail(int value) {
        Node newnode = new Node(value);
        if (isEmpty()) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
        size++;
    }

    public void displayFromHead() {
        if (isEmpty()) return;
        Node trav = head;
        System.out.print("List: ");
        while (trav != null) {
            System.out.print(trav.data + "  ");
            trav = trav.next;
        }
        System.out.println();
    }

    // Method to reverse the linked list
    public void reverse() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node trav = head;
        Node next = null;
        while (trav.next != null) {
            next = trav.next;
            trav.next = trav.next.next;
            next.next = head;
            head = next;
        }
        tail = trav;
    }

    public static void main(String[] args) {
        Program03 p = new Program03();
        p.addFromHead(10);
        p.addFromTail(20);
        p.addFromHead(50);

        System.out.println("Original list:");
        p.displayFromHead();

        p.reverse();

        System.out.println("Reversed list:");
        p.displayFromHead();
    }
}
