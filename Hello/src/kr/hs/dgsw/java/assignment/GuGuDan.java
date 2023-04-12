package kr.hs.dgsw.java.assignment;

import java.util.Scanner;

public class GuGuDan {
    void answer(int num) {
        for(int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num*i);
        }
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        GuGuDan guGuDan = new GuGuDan();

        guGuDan.answer(num.nextInt());
    }
}

//2. 2~9 사이의 정수를 입력하면, 그 숫자의 구구단을 출력하는 프로그램을 작성하세요. 예를 들어 4을 입력하면
//
//        4 * 1 = 4
//        4 * 2 = 8
//        4 * 3 = 12
//        .....
//
//        으로 출력되어야 합니다.