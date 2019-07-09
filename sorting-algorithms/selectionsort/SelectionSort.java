package sorting;

public class SelectionSort {

	public static void sort(int[] array) {
		
		int i, j, minIndex, temp;
		int length = array.length;

		for (i = 0; i < length - 1; i++) {
			minIndex = i;
			
			for (j = i + 1; j < length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
				
			if (minIndex != i) {
				temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}		
	}
}
