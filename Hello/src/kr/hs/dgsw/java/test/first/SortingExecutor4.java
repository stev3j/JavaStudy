package kr.hs.dgsw.java.test.first;

import java.util.Arrays;
import java.util.Random;

public class SortingExecutor4 {
    private static final int MAX_INDEX = 10000;
    private final SelectionSort4 selectionSort4;
    private int[] list;
    private long time;

    public SortingExecutor4() {
        this.selectionSort4 = new SelectionSort4();
    }

    public void insertListData() {
        this.list = new int[MAX_INDEX];
        Random random = new Random();

        for(int i = 0; i < this.list.length; i++) {
            this.list[i] = random.nextInt(10000);
        }
    }

    public int[] doSorting() {
        long start = System.currentTimeMillis();
        selectionSort4.sort(this.list);
        long end = System.currentTimeMillis();

        this.time = end - start;

        return this.list;
    }

    public void printTime() {
        System.out.printf("%d개의 요소를 정렬하는데 %d(ms)의 시간이 소요되었습니다.", this.list.length, this.time);
    }

    public static void main(String[] args) {
        SortingExecutor4 executor4 = new SortingExecutor4();
        executor4.insertListData();

        System.out.println("정렬 전 : " + Arrays.toString(executor4.list));
        int[] sorted = executor4.doSorting();
        System.out.println("정렬 후 : " + Arrays.toString(sorted));

        executor4.printTime();
    }
}
