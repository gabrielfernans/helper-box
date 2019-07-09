package sorting;

public class CountingSort {

	public static int[] countingSort(int[] array, int size) {
	    
        int[] c = new int[size];

        // frequency
        for (int i = 0; i < array.length; i++) {
            c[array[i] - 1] ++;;
        }
        
        // cumulative
        for (int i = 1; i < c.length; i++) {
            c[i] += c[i-1];
        }

        int[] b = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            b[c[array[i] - 1] -1] = array[i];
            c[array[i] - 1] --;
        }

        return b;
    
    }
}
