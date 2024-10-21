package sunbeam.Q1;

public class RecursiveFuctionAdd {
	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
		data = value;
		left = right = null;
		}
		}

		private Node root;
		public RecursiveFuctionAdd() {
		root = null;
		}

		public boolean isEmpty() {
		return root == null;
		}

		public void addNode(int value) {
		root = addNodeRec(root,value);
		}

		public Node addNodeRec(Node root,int value) {
		if(root == null) {
		root = new Node(value);
		return root;
		}

		if(value < root.data) {
		root.left = addNodeRec(root.left,value);
		} else if(value > root.data) {
		root.right = addNodeRec(root.right, value);
		}
		return root;
		}


		private void preOrder(Node trav) {
		if(trav == null)
		return;
		System.out.print(" " + trav.data);
		preOrder(trav.left);
		preOrder(trav.right);
		}

		public void preOrder() {
		System.out.print("PreOrder : ");
		preOrder(root);
		System.out.println("");
		}


		public static void main(String[] args) {

		RecursiveFuctionAdd bst = new  RecursiveFuctionAdd();
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(6);
		bst.addNode(1);
		bst.addNode(14);
		bst.addNode(13);
		bst.addNode(7);
		bst.addNode(4);

		bst.preOrder();




		}

}
