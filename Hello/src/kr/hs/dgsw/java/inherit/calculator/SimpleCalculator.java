package kr.hs.dgsw.java.inherit.calculator;

import java.util.Objects;
import java.util.Scanner;

public abstract class SimpleCalculator {

    protected int op1;
    protected int op2;
    protected String operator;

    protected final Scanner scanner = new Scanner(System.in);

    public void execute() {
        while (true) {
            // 기호를 입력 받는다.
            inputOperands();

            // 둘다 0이라면
            if (op1 == 0 && op2 == 0) {
                break;
            }

            // 계산
            int result = calulator();

            // 출력
            printResult(result);
        }
    }

    public void printResult(int result) {
        System.out.printf("%d %s %d = %d\n",
                op1, getOperator(), op2, result);
    }

    public abstract int calulator();

    public void inputOperands() {
        System.out.println("두개의 정수를 입력하세요, ");
        this.op1 = scanner.nextInt();
        this.op2 = scanner.nextInt();
    }

    public abstract String getOperator();

    public static void main(String[] args) {

    }
}
