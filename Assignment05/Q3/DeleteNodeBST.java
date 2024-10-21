package sunbeam.Q3;

public class DeleteNodeBST {
		static class Node {
		       private int data;
		       private Node left, right;

		       public Node(int value) {
		           data = value;
		           left = right = null;
		       }
		   }

		   private Node root;

		   public DeleteNodeBST() {
		       root = null;
		   }

		   public void addNode(int value) {
		       root = addNode(root, value);
		   }

		   private Node addNode(Node root, int value) {
		       if (root == null) {
		           root = new Node(value);
		           return root;
		       }

		       if (value < root.data) {
		           root.left = addNode(root.left, value);
		       } else if (value > root.data) {
		           root.right = addNode(root.right, value);
		       }
		       return root;
		   }

		   public void deleteNode(int key) {
		       root = deleteRec(root, key);
		   }

		   private Node deleteRec(Node root, int key) {
		       if (root == null) return root;

		       if (key < root.data) {
		           root.left = deleteRec(root.left, key);
		       } else if (key > root.data) {
		           root.right = deleteRec(root.right, key);
		       } else {
		           if (root.left == null)
		               return root.right;
		           else if (root.right == null)
		               return root.left;

		           root.data = minValue(root.right);

		           root.right = deleteRec(root.right, root.data);
		       }

		       return root;
		   }

		   private int minValue(Node root) {
		       int minValue = root.data;
		       while (root.left != null) {
		           root = root.left;
		           minValue = root.data;
		       }
		       return minValue;
		   }

		   private void preOrder(Node trav) {
		       if (trav == null)
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
		DeleteNodeBST bst = new DeleteNodeBST();
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

		        bst.deleteNode(3);
		        System.out.println("After deleting node 3:");
		        bst.preOrder();


		}

}
