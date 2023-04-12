package kr.hs.dgsw.java.assignment;

import java.util.ArrayList;

public class Money {
    static final int[] moneyList = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
    static final int[] countList = {0, 0, 0, 0, 0, 0, 0, 0};

    void answer(int money) {

        int i = 0;
        while (money != 0) {
            if (money > moneyList[i]) {
                int count = money / moneyList[i];
                countList[i] = count;
                money = money % moneyList[i];
                i += 1;
            } else {
                i += 1;
            }
        }
    }

    public static void main(String[] args) {
        Money money = new Money();
        money.answer(124820);

        if (countList[0] > 0) {
            System.out.printf("오만원권 %d장, ", countList[0]);
        } if (countList[1] > 0) {
            System.out.printf("일만원권 %d장, ", countList[1]);
        } if (countList[2] > 0) {
            System.out.printf("오천원권 %d장, ", countList[2]);
        } if (countList[3] > 0) {
            System.out.printf("일천원권 %d장, ", countList[3]);
        } if (countList[4] > 0) {
            System.out.printf("오백원권 %d장, ", countList[4]);
        } if (countList[5] > 0) {
            System.out.printf("일백원권 %d장, ", countList[5]);
        } if (countList[6] > 0) {
            System.out.printf("오십원권 %d장, ", countList[6]);
        } if (countList[7] > 0) {
            System.out.printf("일십원권 %d장, ", countList[7]);
        }
    }
}
