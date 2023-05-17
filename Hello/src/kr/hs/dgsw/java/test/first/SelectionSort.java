package kr.hs.dgsw.java.test.first;

public class SelectionSort {

    // sort
    // selectionSort
    public int[] sort(int[] unsorted) {
        return this.doSelectionSorting(unsorted);
    }

    private int[] doSelectionSorting(int[] unsorted) {

        for(int i = 0; i < 10000 - 1; i++) {
            int min_index = i;

            // 최솟값을 갖고있는 인덱스 찾기
            for(int j = i + 1; j < 10000; j++) {
                min_index = inputMin(unsorted, min_index, j);
            }

            // i번째 값과 찾은 최솟값을 서로 교환
            swap(unsorted, min_index, i);
        }

        return unsorted;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static int inputMin(int[] unsorted, int min_index, int j) {
        if(unsorted[j] < unsorted[min_index]) {
            min_index = j;
        }
        return min_index;
    }

}