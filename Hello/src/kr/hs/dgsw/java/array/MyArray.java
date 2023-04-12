package kr.hs.dgsw.java.array;

import java.util.Random;

public class MyArray {

    int[] array = new int[10];

    void makeArray() {
        Random random = new Random(System.currentTimeMillis());
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
    }

    void printArray() {
        for(int value : array) {
            System.out.printf("%d, ", value);
        }
    }

    void printMinIndex() {
        int min = 10000000;
        int minIndex = 0;

        for(int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.printf("array의 가장 작은 수는 %d번째에 있습니다.", minIndex);
    }

    int addArray() {
        int sum = 0;

        for(int value: array) {
            sum += value;
        }
        return sum;
    }

    double average() {
        int sum = addArray();
        return sum / array.length;
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray();

        myArray.makeArray();
        double ave = myArray.average();
        System.out.println(ave);
    }
}
