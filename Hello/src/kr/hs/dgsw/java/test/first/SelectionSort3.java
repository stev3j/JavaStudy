package kr.hs.dgsw.java.test.first;

public class SelectionSort3 {
    public int[] sort(int[] unsorted) {
        return this.selectionSort(unsorted);
    }

    private int[] selectionSort(int[] unsorted) {
        for(int i = 0; i < 10000-1; i++) {
            int min_index = i;

            for(int j = i+1; j < 10000; j++) {
                min_index = insertMinIndex(unsorted, min_index, j);
            }
            swap(unsorted, min_index, i);
        }
        return unsorted;
    }

    private void swap(int[] unsorted, int min_index, int i) {
        int temp = unsorted[min_index];
        unsorted[min_index] = unsorted[i];
        unsorted[i] = temp;
    }

    private int insertMinIndex(int[] unsorted, int min_index, int j) {
        if (unsorted[min_index] > unsorted[j]) {
            return j;
        }
        return min_index;
    }
}
