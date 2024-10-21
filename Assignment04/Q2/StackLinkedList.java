
package sunbeam.Q2;
public class StackLinkedList {
    private Node top;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public StackLinkedList() {
        top = null;
    }

    // Push operation
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return -1; // Return a sentinel value indicating the stack is empty
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    // Peek operation
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return -1; // Return a sentinel value indicating the stack is empty
        }
        return top.data;
    }

    // Display stack
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return;
        }
        Node current = top;
        while (current != null) {
            System.out.print(current.data + "  ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
    	StackLinkedList st = new StackLinkedList();
    	st.push(10);
    	st.push(20);
    	st.push(90);
    	st.push(50);
    	st.push(60);
    	st.display();
	}
}
