package kr.hs.dgsw.java.test.first;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// 실수해서 soft 했는데 다시 푸시했더니 충돌나는 경우는 왜 그러는겨?

public class SortingExecutor {

    private static final int SAMPLE_DATA_SIZE = 10000;

    private final SelectionSort selectionSort;

    private int[] sampleData;

    private long elapsedTime;

    /* 생성자 */
    public SortingExecutor() {
        this.selectionSort = new SelectionSort();
    }

    /* 리스트 생성 */
    public void makeSampleData() {
        this.sampleData = new int[SAMPLE_DATA_SIZE];
        Random random = new Random();

        for (int i = 0 ; i < this.sampleData.length ; i++) {
            this.sampleData[i] = random.nextInt(10000);
        }
    }

    /* 선택 정렬 */
    public int[] doSorting() {
        long start = System.currentTimeMillis();
        int[] sorted = selectionSort.sort(this.sampleData);
        long end = System.currentTimeMillis();

        this.elapsedTime = end - start; // 경과 시간

        return sorted;
    }

    /* 경과 시간 */
    public void printElapsedTime() {
        System.out.printf("%d개의 자료를 정렬하는데 %d(ms)의 시간이 경과했습니다.\n", this.sampleData.length, this.elapsedTime);
    }

    public static void main(String[] args) {
        SortingExecutor executor = new SortingExecutor();

        executor.makeSampleData();
        System.out.println("정렬전 : " + Arrays.toString(executor.sampleData));
        int[] sorted = executor.doSorting();
        System.out.println("정렬후 : " + Arrays.toString(sorted));

        executor.printElapsedTime();
    }

}