package Q2;

public class PriorityQueueMain {
	public static void main(String[] args) {
		Queue PriQ = new Queue (20);
		System.out.println("Is empty : "+PriQ.isEmpty());
		System.out.println("Is Full : "+PriQ.isFull());
//		PriQ.pushMax(6);
//		PriQ.pushMax(14);
//		PriQ.pushMax(3);
//		PriQ.pushMax(26);
//		PriQ.pushMax(8);
//		PriQ.pushMax(18);
//		PriQ.pushMax(21);
//		PriQ.pushMax(9);
//		PriQ.pushMax(5);

		//MIN OPERATION
		PriQ.pushMin(6);
		PriQ.pushMin(14);
		PriQ.pushMin(3);
		PriQ.pushMin(26);
		PriQ.pushMin(8);
		PriQ.pushMin(18);
		PriQ.pushMin(21);
		PriQ.pushMin(9);
		PriQ.pushMin(5);
		
		System.out.println("Peeked element : "+PriQ.peek());
//		System.out.println("Popped element by max : "+PriQ.popMax());
		
		System.out.println("Popped element by min : "+PriQ.popMin());

		
	}

}
