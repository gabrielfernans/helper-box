package bst;

public class BST {
	private Node root;
	
	public BST() {
		root = new Node(null);
	}
	
	public void add(Integer element) {
		if (element != null) {
			add(root, element);
		}
	}
	
	private void add(Node node, Integer element) {
		if (node.getData() == null) {
			node.setData(element);
			node.setLeft(new Node(null));
			node.setRight(new Node(null));
			node.getLeft().setParent(node);
			node.getRight().setParent(node);
		}
		
		else {
			if (element > node.getData()) {
				add(node.getRight(), element);
			}
			
			else {
				add(node.getLeft(), element);
			}
		}
	}

	public int height() {
		return height(this.root);
	}
	
	private int height(Node node) {
		int result = -1;
		
		if (!node.isEmpty()) {
			int leftHeight = height(node.getLeft());
			int rightHeight = height(node.getRight());
			
			if (leftHeight > rightHeight) {
				result = leftHeight + 1;
			}
			
			else {
				result = rightHeight + 1;
			}
		}
		return result;
	}
	
	public Node search(Integer element) {
		return search(element, this.root);
	}

	private Node search(Integer element, Node node) {
		if (node.isEmpty() || element == null) {
			return null;
		}
		
		if (element == node.getData()) {
			return node;
		}
		
		else if (element > node.getData()) {
			return search(element, node.getRight());
		}
		
		else {
			return search(element, node.getLeft());
		}
		
	}
	
	public Node min() {
		return min(this.root);
	}
	
	private Node min(Node node) {
		if (node.isEmpty()) {
			return null;
		}
		
		if (node.getLeft().isEmpty()) {
			return node;
		}
		
		else {
			return min(node.getLeft());
		}
	}

	public Node max() {
		return max(this.root);
	}
	
	private Node max(Node node) {
		if (node.isEmpty()) {
			return null;
		}
		
		if (node.getRight().isEmpty()) {
			return node;
		}
		
		else {
			return max(node.getRight());
		}
	}

	public Node successor(Integer element) {
		Node node = search(element);
		return successor(node);
	}

	private Node successor(Node node) {
		return null;
	}

	public Node predeccessor(Integer element) {
		return null;
	}
	
	public void bfs() {
		
	}

	public void remove(Integer element) {
		
	}
	
	public void preOrder() {
		
	}
	
	public void inOrder() {
		
	}
	
	public void postOrder() {
		
	}
	
	public Node getRoot() {
		return root;
	}
	
	public boolean isEmpty() {
		return root.isEmpty();
	}
	
	public String toString() {
		String result = "";
		return result;
	}
	
	public static void main(String[] args) {
		BST tree = new BST();
		Integer[] array = { 6, 23, -34, 5, 9, 2, 0, 76, 12, 67, 232, -40 };
		
		for (int i : array) {
			tree.add(i);
		}
		
		System.out.println(tree.min().getData());
		System.out.println(tree.max().getData());
		System.out.println(tree.height());
		System.out.println(tree.search(76));
	}
}
