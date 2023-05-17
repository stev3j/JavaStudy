package kr.hs.dgsw.java.test.first;

public class SelectionSort2 {

    public int[] sort(int[] unsorted) {
        return this.selectionSort(unsorted);
    }

    private int[] selectionSort(int[] unsorted) {
        for(int i = 0; i < 10000-1; i++) {
            int min_index = i;

            for(int j = i+1; j < 10000; j++) {
                min_index = inputMinIndex(unsorted, j, min_index);
            }
            swap(unsorted, i, min_index);
        }
        return unsorted;
    }

    private void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    private int inputMinIndex(int[] unsorted, int j, int min_index) {
        if (unsorted[j] < unsorted[min_index]) {
            return j;
        }
        return min_index;
    }
}
