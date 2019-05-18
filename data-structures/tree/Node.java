package tree;

public class Node {
	int data;
	Node parent;
	Node left;
	Node right;
	
	Node(int data) {
		this.data = data;
	}
	
	public void add(int value) {
		if (value != this.data) {
			
			if (value > this.data) {
				
				if (this.right == null) {
					Node newNode = new Node(value);
					this.right = newNode;
					newNode.parent = this;
				}
				
				else {
					this.right.add(value);
				}
			}
			else if (value < this.data) {
				
				if (this.left == null) {
					Node newNode = new Node(value);
					this.left = newNode;
					newNode.parent = this;
				}
				
				else {
					this.left.add(value);
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
}
