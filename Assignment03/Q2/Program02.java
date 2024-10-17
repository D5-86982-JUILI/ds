package sunbeam.Q2;

public class Program02 {
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

public Program02() {
head = null;
tail = null;
size = 0;
}

public int size() {
return size;
}

public boolean isEmpty() {
return head == null && tail == null;

}

public void addFromHead(int value) {
Node newnode = new Node(value);
if(isEmpty()) {
head = tail = newnode;
tail.next=head;
}
else {
newnode.next=head;
tail.next = newnode;
head = newnode;
}
size ++;
}

public void addFromTail(int value) {
Node newnode = new Node(value);
if(isEmpty()) {
head = tail = newnode;
tail.next=head;
}
else {
newnode.next=head;
tail.next = newnode;
tail = newnode;
}
size ++;
}



public void displayFromHead() {
if(isEmpty())
return;

Node trav = head;
System.out.print("List: ");

do {
System.out.print(trav.data);
System.out.print(" ");

trav = trav.next;

} while(trav != head);

}

	public void insertBefore(Node nextNode, int data) {
        if (head == null || nextNode == null) {
            System.out.println("The list is empty!");
            return;
        }
        Node newNode = new Node(data);
        if (head == nextNode) {
            newNode.next = head;
            head = newNode;
        } else {
            Node trav = head;
            while (trav.next != nextNode) {
                if (trav.next == null) {
                    System.out.println("The given next node is not found in the list!");
                    return;
                }
                trav = trav.next;
            }
            newNode.next = trav.next;
            trav.next = newNode;
        }
        
       
    }
	public void insertAfter(Node prevNode, int data) {
	       if (prevNode == null) {
	           System.out.println("The given previous node cannot be null");
	           return;
	       }
	       Node newNode = new Node(data);
	       newNode.next = prevNode.next;
	       prevNode.next = newNode;
	   }
	
	public static void main(String[] args) {
		Program02 p = new Program02();
		p.addFromHead(10);
		p.addFromTail(20);
		p.addFromHead(30);
		p.addFromHead(40);
		p.addFromHead(50);
		System.out.println("Linked List = ");
		p.displayFromHead();
		System.out.println();
		System.out.println("Inserting before  = ");
		p.insertBefore(p.head.next, 60);
		p.displayFromHead();
		System.out.println();
		System.out.println("Inserting after = ");
		p.insertAfter(p.head.next.next, 90);
		p.displayFromHead();
	}


}



