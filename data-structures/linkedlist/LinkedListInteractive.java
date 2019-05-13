package linkedlist;

public class LinkedList {
	private Node head;
	private int size;
	
	public LinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}
	
	public void addLast(int v) {
		Node newNode = new Node(v);
		
		if (this.isEmpty()) {
			this.head = newNode;
		}
		
		else {
			Node aux = head;
			
			while(aux.next != null) {
				aux = aux.next;
			}
			aux.next = newNode;
		}
		this.size ++;
	}

	public Node search(int value) {
		Node auxNode = head;
		
		while (auxNode != null && auxNode.value != value) {
			auxNode = auxNode.next;	
		}
		return auxNode;
	}	
	
	public boolean remove(int value) {
		if (!this.isEmpty()) {
			if (this.head.value == value) {
				this.head = this.head.next;
				this.size --;
				return true;
			}
			Node prev = null;
			Node aux = head;
			
			while (aux != null && aux.value != value) {
				prev = aux;
				aux = aux.next;
			}
			
			if (aux == null) 
				return false;
			
			else {
				prev.next = aux.next;
				this.size --;
				return true;
			}
		}
		return false;
	}
	
	public void removeLast() {
		if(!this.isEmpty()) {
			if (this.head.next == null) {
				this.head = null;
			}
			
			else {
				Node prev = null;
				Node aux = head;
				
				while (aux.next != null) {
					prev = aux;
					aux = aux.next;
				}
				prev.next = null;
			}
			this.size --;
		}	
	}
	
	public int size() {
		return this.size;
	}
	
	public String toString() {
		String out = "";
		Node aux = head;
		
		while (aux != null) {
			out += aux.value + " ";
			aux = aux.next;
		}
		return out.trim();
	}
}

class Node {
	int value;
	Node next;
	
	public Node(int value) {
		this.value = value;
		this.next = null;
	}
}
