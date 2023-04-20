package kr.hs.dgsw.java.startpackage;

public class Accumulator {
    int sum = 0;

    void add(int value) {
        sum += value;
    }

    int getSum() {
        return sum;
    }

    void reset() {
        sum = 0;
    }

    public static void main(String[] args) {
        Accumulator accu = new Accumulator();

        accu.add(123);
        int sum = accu.getSum();
        System.out.println(sum);

        accu.reset();
        int sum2 = accu.getSum();
        System.out.println(sum2);
    }

}
