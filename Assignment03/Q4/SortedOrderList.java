package sunbeam.Q4;

public class SortedOrderList {
    static class Node {
        int data;
        Node next;

        public Node(int value) {
            data = value;
            next = null;
        }
    }

    private Node head;

    public SortedOrderList() {
        head = null;
    }

    // Add node in sorted order
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null || head.data >= newNode.data) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node trav = head;
        while (trav.next != null && trav.next.data < newNode.data) {
            trav = trav.next;
        }
        newNode.next = trav.next;
        trav.next = newNode;
    }

    // Print the list
    public void printList() {
        Node trav = head;
        while (trav != null) {
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortedOrderList list = new SortedOrderList();
        System.out.println("List before sorting: ");
        list.add(50);
        list.add(30);
        list.add(10);
        list.add(40);
        list.add(20);
        list.printList();

        System.out.println("List after adding elements in sorted order: ");
        list.add(70);
        list.add(5);
        list.add(100);
        list.printList();
    }
}
