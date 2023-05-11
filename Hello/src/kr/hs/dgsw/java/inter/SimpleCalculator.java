package kr.hs.dgsw.java.inter;

import java.util.Scanner;

public class SimpleCalculator {

    private final Scanner scanner = new Scanner(System.in);
    private int op1;
    private int op2;

    public void excute() {

        while (true) {
            inputOperands();
            if (op1 == 0 && op2 == 0) {
                break;
            }
            int result = Calculator.calculator(op1, op2);
            printResult(result);
        }
    }

    public void printResult(int result) {
        System.out.printf("%d %s %d = %d\n",
                op1, Calculator.getOperator(), op2, result);
    }

    public void inputOperands() {
        System.out.println("두개의 정수를 입력하세요, ");
        this.op1 = scanner.nextInt();
        this.op2 = scanner.nextInt();
    }

    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.excute();
    }
}
