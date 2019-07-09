package sorting;

public class QuickSort {

	public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pos_pivot = partition(array, left, right);
            quickSort(array, left, pos_pivot - 1);
            quickSort(array, pos_pivot + 1, right);
        }
    }

    public static int partition(int[] array, int left, int right) {
        
        int pivot = array[left];
        int i = left;

        for (int j = left + 1; j <= right; j++) {
            if (array[j] < pivot) {
                i++;;
                swap(array, i, j);
            }
        }

        swap(array, left, i);        
        return i; 
    }

    public static void swap(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}
