package tree;	

public class BinaryTree {
	private Node root;
	
	public Node getRoot() {
		return this.root;
	}
	public boolean isEmpty() {
		return this.root == null;
	}
	
	public void add(int value) {
		if (this.isEmpty()) {
			this.root = new Node(value);
		}
		else {
			this.root.add(value);
		}
	}
	
	public int remove(int value) {
		return -1;
	}
	
	public Node min(Node node) {
		return node;
	}
	
	public Node max(Node node) {
		return node;
	}
	
	public Node successor(Node node) {
		return node;
	}
	
	public Node predecessor(Node node) {
		return node;
	}
	
	public void preOrder() {
		
	}
	
	public void inOrder() {
		
	}

	public void postOrder() {
		
	}
	
	public int size() {
		return -1;
	}
	
	public int size(Node node) {
		return -1;
	}
	
	public void bfs() {
		
	}

}
