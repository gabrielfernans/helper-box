package sorting;

public class MergeSort {

	
public static void mergeSort(int[] array, int left, int right) {
        
        if (left < right) {
        	int mid = (left + right) / 2;
        	mergeSort(array, left, mid);
        	mergeSort(array, mid+1, right);

        	merge(array, left, mid, right);
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {
    
        int[] helper = new int[array.length];

        for (int i = left; i <= right; i++) {
            helper[i] = array[i];
        }

        int i = left;
        int j = mid + 1;
        int k = left;
    
        while (i <= mid && j <= right) {
            if (helper[i] < helper[j]) {
                array[k] = helper[i];
                i++;
            } 
            
            else {
                array[k] = helper[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            array[k] = helper[i];
            k++;
            i++;
        }

        while (j <= right) {
            array[k] = helper[j];
            k++;
            j++;
        }
    }
}
