package sorting;

public class InsertionSort {

	
	public static void sort(int[] array) {
		
		int i, j, current;
		
		for (i = 1; i < array.length; i++) {
			
			current = array[i];
			
			j = i;
			
			while ((j > 0) && (array[j - 1] > current)) {
				array[j] = array[j - 1];
				j = j - 1;
			}
			array[j] = current;
			
		}
	}
}
