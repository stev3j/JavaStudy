package kr.hs.dgsw.java.test.first;


import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class SortingExecutor2 {

    private static final int MAX_INDEX = 10000;

    private final SelectionSort2 selectionSort2;

    private int[] list;

    private long time;

    public SortingExecutor2() {
        this.selectionSort2 = new SelectionSort2();
    }

    public void inputListData() {
        this.list = new int[MAX_INDEX];
        Random random = new Random();

        for(int i = 0; i < this.list.length; i++) {
            this.list[i] = random.nextInt(10000);
        }
    }

    public int[] doSorting() {
        long start = System.currentTimeMillis();
        int[] sorted = selectionSort2.sort(list);
        long end = System.currentTimeMillis();

        this.time = end - start;

        return sorted;
    }

    public void printTime() {
        System.out.printf("%d개의 자료를 정렬하는데 %d(ms)의 시간이 경과되었습니다.\n", this.list.length, this.time);
    }

    public static void main(String[] args) {
        SortingExecutor2 executor2 = new SortingExecutor2();

        executor2.inputListData();
        System.out.println("정렬 전 : " + Arrays.toString(executor2.list));
        int[] sorted = executor2.doSorting();
        System.out.println("정렬 후 : " + Arrays.toString(sorted));

        executor2.printTime();
    }

}
