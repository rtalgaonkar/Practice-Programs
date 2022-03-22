package DataStructures;

public class BreadthFirstSearch {

	public static void main(String[] args) {
		Node root = new Node(3);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(1);
		root.left.right = new Node(4);
		System.out.println(root);
		boolean isBst = isBst(root, null, null);
		if(isBst)
			System.out.println("IS BST");
		else
			System.out.println("is not BST");
	}

	private static boolean isBst(Node root, Node left, Node right) {
		if(root == null)
			return true;
		if(left != null && left.data >= root.data) {
			System.out.println(left.data + " >= " + root.data);
			return false;
		}
		if(right != null && right.data <= root.data) {
			System.out.println(right.data + " <= " + root.data);
			return false;
		}
		return(isBst(root.left, left, root) && isBst(root.right, root, right));
	}
}

class Node {
	
	int data;
	Node left, right;
	public Node(int data) {
		this.data = data;
		left = right = null;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	
	
}
