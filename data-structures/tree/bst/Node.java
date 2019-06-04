
public class Node {
	
	private Integer data;
	private Node parent;
	private Node left;
	private Node right;
	
	public Node(Integer data) {
		this.data = data;
	}
	
	public boolean isEmpty() {
		return this.data == null;
	}

	public Integer getData() {
		return data;
	}

	public Node getParent() {
		return parent;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	
	public boolean isLeaf() {
		return this.left == null && this.right == null;
	}
	public String toString() {
		return this.data + "";
	}
}