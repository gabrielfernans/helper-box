package heap;

public class Heap {

	private int[] heap;
	private int index;
	
	public Heap(int capacity) {
		this.heap = new int[capacity];
		this.index = -1;
	}
	
	public int left(int i) {
		return (2 * i) + 1;
	}
	
	public int right(int i) {
		return (2 * i) + 1;
	}
	
	public int parent(int i) {
		return (i - 1) / 2;
	}
	
	public void add(int element) {
		
		this.heap[++ this.index] = element;
		int aux = this.index;
		
		
	}
	
	public void remove(int element) {
		
	}
	
	public void buidHeap(int[] array) {
		
	}
	
	private void heapify(int element) {
		
	}
	
	public boolean isEmpty() {
		return this.index == -1;
	}
}
