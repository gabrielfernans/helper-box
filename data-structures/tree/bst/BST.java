package bst;

import java.util.Deque;
import java.util.LinkedList;

public class BST {
	private Node root;
	
	public void add(Integer element) {
		if (element != null) {
			this.add(this.root, element);
		}
	}
	
	private void add(Node node, Integer element) {
		if (isEmpty()) {
			node.setData(element);
			node.setLeft(new Node(null));
			node.setRight(new Node(null));
			node.getLeft().setParent(node);
			node.getRight().setParent(node);
		}
		
		else {
			
			if (element < node.getData()) {
				add(node.getLeft(), element);
			}
			
			else if (element > node.getData()) {
				add(node.getRight(), element);
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
			return new Node(null);
		}
		
		if (element == node.getData()) {
			return node;
		}
		
		else if (element > node.getData()) {
			return search(element, node.getLeft());
		}
		
		else {
			return search(element, node.getRight());
		}
	}
	
	public Node min() {
		return min(this.root);
	}
	
	private Node min(Node node) {
		if (node.getLeft() == null) {
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
		if (node.getRight() == null) {
			return node;
		}
		
		else {
			return max(node.getRight());
		}
	}

	public Node successor(Integer element) {
		Node node = search(element);
		
		if (node.getRight() != null) {
			return min(node.getRight());
		}
		
		Node aux = node;
		
		while (aux.getParent() != null) {
			if (aux.getParent().getData() > node.getData()) {
				return aux.getParent();
			}
			aux = aux.getParent();
		}
		return null;
	}

	public Node predeccessor(Integer element) {
		Node node = search(element);
		
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
			
			queue.addLast(this.root);
			
			while(!queue.isEmpty()) {
				
				Node node = queue.removeFirst();
				System.out.println(node.getData());
				
				if (node.getLeft() != null) {
					queue.addLast(node.getLeft());
				}
				
				if(node.getRight() != null) {
					queue.addLast(node.getRight());
				}
			}
		}
	}
	
	public void preOrder() {
		
	}
	
	public void inOrder() {
		
	}
	
	public void postOrder() {
		
	}
	
	public void remove(Integer element) {
		
	}
	
	public Node getRoot() {
		return this.root;
	}
	
	public boolean isEmpty() {
		return this.root == null;
	}
	
	public static void main(String[] args) {
		
	}
}
