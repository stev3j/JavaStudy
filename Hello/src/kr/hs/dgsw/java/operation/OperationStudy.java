package kr.hs.dgsw.java.operation;

import java.util.ArrayList;

public class OperationStudy {

    void studyArithmetic() {
        int op1 = 5;
        int op2 = 3;

        int plus = op1 + op2;
        int minus = op1 - op2;
        int multiply = op1 * op2;
        int divide = op1 / op2;
        int modulus = op1 % op2;

        op2 = 0;
        modulus = op1 % op2;
    }

    void studyRelational() {
        int op1 = 3;
        int op2 = 5;

        boolean result;
        result = op1 == op2;
        result = op1 > op2;
        result = op1 < op2;
        result = op1 != op2;
        result = op1 >= op2;
        result = op1 <= op2;
    }

    //    ArrayList<Integer> toBinary(int n) {
//        ArrayList<Integer> list = new ArrayList<>();
//        while (n > 1){
//            n = n%2;
//            list.add(n);
//        }
//        return list;
//    }

    void studyNot() {
        byte value = (byte) 0b11110101;
        byte value2 = (byte) ~value; // 모든 비트 거꾸로

        System.out.printf("~%d = %02X\n", value, value2);
    }

    void studyLeftShift() {
        byte value = 64; // 110 > 1100(12) > 11000(24)
        byte result;

        result = (byte)(value << 1);

        System.out.printf("%d", result);
    }

    void studyRightShift() {
        byte value = -128; // 100 0000 > 10 0000(32) > 1 0000(16)
        byte result;
        int count = 1; // -부호가 있는 상태에서 RightShift를 하면 부호비트 1 은 보존함

        result = (byte)(value >>> count);

        System.out.printf("%d >>> %d = %d", value, count, result);
    }

    public static void main(String[] args) {
        OperationStudy object = new OperationStudy();

        object.studyRightShift();
    }
}
