package kr.hs.dgsw.java;

public class Adder {

    int add(int operand1, int operand2) {
        int sum = operand1 + operand2;
        return sum;
    }

    int add(int operand1, int operand2, int operand3) {
        int sum = operand1 + operand2 + operand3;
        return sum;
    }

    public static void main(String[] args) {
        Adder adder = new Adder();

        int sum = adder.add(192837, 1239847);
        System.out.println(sum);

        int sum2 = adder.add(192837, 1239847, 123834);
        System.out.println(sum2);
    }

}
