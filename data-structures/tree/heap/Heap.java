package heap;

public class Heap {

	private int[] heap;
	private int tail;
	
	public Heap(int capacity) {
		this.heap = new int[capacity];
		this.tail = -1;
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
		
		if (tail < heap.length - 1) {
			tail ++;
			this.heap[tail] = element;
			
			int i = tail;
			
			while (i > 0 && this.heap[parent(i)] < this.heap[i]) {
				
			}
 			
		}
		
	}
	
	public void remove(int element) {
		
	}
	
	public void buidHeap(int[] array) {
		
	}
	
	private void heapify(int element) {
		
	}
	
	public boolean isEmpty() {
		return this.tail == -1;
	}
}
