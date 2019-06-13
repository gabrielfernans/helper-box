package heap;

public class Heap {

	private int[] heap;
	private int size;
	
	public Heap(int capacity) {
		this.heap = new int[capacity];
		this.size = -1;
	}
	
	public int left(int i) {
		return (2 * i) + 1;
	}
	
	public int right(int i) {
		return 2 * (i + 1);
	}
	
	public int parent(int i) {
		return (i - 1) / 2;
	}
	
	public void insert(int element) {
		
		if (size < heap.length - 1) {
			size ++;
			this.heap[size] = element;
			
			int aux = size;
			
			while (aux > 0 && this.heap[parent(aux)] < this.heap[aux]) {
				swap(heap, aux, parent(aux));
				aux = parent(aux);
			}
		}
	}
	
	public void buildHeap(int[] array) {
		if (array != null) {
			this.heap = array;
			this.size = array.length - 1;
			
			for (int i = this.heap.length -1; i >= 0; i--) {
				heapify(i);
			}
		}
	}
	
	private void heapify(int element) {
		if (element >= 0 && element <= size) {
			int left = left(element);
			int right = right(element);
			
			int largest = element;
			
			if (left <= size && largest < left) {
				largest = left;
			}
			
			if (right <= size && largest < right) {
				largest = right;
			}
			
			if (largest != element) {
				swap(heap, largest, element);
				heapify(largest);
			}
		}
	}
	
	public boolean isEmpty() {
		return this.size == -1;
	}

	private void swap(int[] heap, int i, int j) {
		int aux = heap[i];
		heap[i] = heap[j];
		heap[j] = aux;
	}
	
	public String toString() {
		String result = "";
		
		for (int i = 0; i < heap.length - 1; i++) {
			if (heap[i] != 0) {
				result += heap[i] + " ";
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] array = new int[] {2,3,5,9,4,1,6,7,10,-1};
		
		Heap heap = new Heap(15);
		
		for (int i = 0; i < array.length - 1; i++) {
			heap.insert(array[i]);
		}
		
		System.out.println(heap.toString());
	}
}
