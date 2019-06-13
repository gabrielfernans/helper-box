package bst;

import java.util.Deque;
import java.util.LinkedList;

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
		if (node.getRight().getData() != null) {
			return min(node.getRight());
		}
		
		Node aux = node;
		
		while (aux.getParent().getData() != null) {
			if (aux.getParent().getData() > node.getData()) {
				return aux.getParent();
			}
			aux = aux.getParent();
		}
		return null;
	}

	public Node predeccessor(Integer element) {
		Node node = search(element);
		return predeccessor(node);
	}
	
	private Node predeccessor(Node node) {
		if (node.getLeft() != null) {
			return max(node.getLeft());
		}
		
		Node aux = node;
		
		while (aux.getParent() != null) {
			if (aux.getParent().getData() < node.getData()) {
				return aux.getParent();
			}
			aux = aux.getParent();
		}
		return null;
	}

	public void bfs() {
		if (!isEmpty()) {
			Deque<Node> queue = new LinkedList<Node>();
            queue.addLast(root);

            while (!queue.isEmpty()) {
            	
            	Node n = queue.removeFirst();
                System.out.print(n.getData() + " ");
                
                if (n.getLeft().getData() != null)
                	queue.addLast(n.getLeft());
                
                if (n.getRight().getData() != null)
                	queue.addLast(n.getRight());
            }
		}
	}

	public void remove(Integer element) {
		
	}
	
	public void preOrder() {
		if (!isEmpty()) {
            preOrder(root);
        }
	}
	
	private void preOrder(Node node) {
		System.out.print(node.getData() + " ");
		
		if (node.getLeft().getData() != null) {
			preOrder(node.getLeft());
		}
		
		if (node.getRight().getData() != null) {
			preOrder(node.getRight());
		}
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
		System.out.println(tree.successor(9));
		System.out.println(tree.predeccessor(9));
		tree.preOrder();
		System.out.println("\n");
		tree.bfs();
	}
}
