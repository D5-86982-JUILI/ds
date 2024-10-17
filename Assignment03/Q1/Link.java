package sunbeam.Q1;

public class Link {
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

public Link() {
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


public static void main(String[] args) {
Link l1 = new Link();

l1.addFromHead(50);
l1.addFromHead(40);
l1.addFromHead(30);
l1.addFromHead(20);
l1.addFromHead(10);

l1.addFromTail(60);
l1.addFromTail(70);
l1.addFromTail(80);

l1.displayFromHead();
System.out.println();
System.out.println("Size = "+l1.size);
}

}
