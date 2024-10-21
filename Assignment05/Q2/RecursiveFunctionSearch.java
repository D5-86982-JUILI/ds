package sunbeam.Q2;

public class RecursiveFunctionSearch {
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

		public RecursiveFunctionSearch() {
		root = null;
		}

		public void addNode(int value) {
		root = addNode(root,value);
		}

		public Node addNode(Node root,int value) {
		if(root == null) {
		root = new Node(value);
		return root;
		}

		if(value < root.data) {
		root.left = addNode(root.left,value);
		} else if(value > root.data) {
		root.right = addNode(root.right, value);
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

		public Node binarySearch(int key) {

		return binarySearch(root,key);
		}

		private Node binarySearch(Node root,int key) {

		if (root == null || root.data == key)
		            return root;

		if(root.data < key)
		return binarySearch(root.right,key);

		else
		return binarySearch (root.left, key);
		}


		// public Node[] ParentSearchNode(int key) {
		// Node trav = root;
		// Node parent = null;
		//
		// while(trav != null) {
		// if(key == trav.data)
		// break;
		// parent = trav;
		//
		// if(key < trav.data)
		// trav = trav.left;
		//
		// else
		// trav = trav.right;
		// }
		// if(trav == null)
		// parent = null;
		// return new Node[] {trav,parent};
		// }

		public static void main(String[] args) {

		RecursiveFunctionSearch search = new RecursiveFunctionSearch();

		search.addNode(8);
		search.addNode(3);
		search.addNode(10);
		search.addNode(6);
		search.addNode(1);
		search.addNode(14);
		search.addNode(13);
		search.addNode(7);
		search.addNode(4);

		search.preOrder();

		RecursiveFunctionSearch.Node ret = search.binarySearch(14);
		if(ret == null)
		System.out.println("Key is not found");
		else
		System.out.println("Key is found");

		}


}
