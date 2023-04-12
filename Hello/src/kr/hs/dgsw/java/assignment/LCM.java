package kr.hs.dgsw.java.assignment;

import java.util.Scanner;

public class LCM {

    void answer(int a, int b) {
        int tmp;
        if (b > a) {
            tmp = a;
            a = b;
            b = tmp;
        }
        for(int i = a; ; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.printf("%d와 %d의 최소공배수는 %d입니다.", a, b, i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        LCM lcm = new LCM();
        lcm.answer(a.nextInt(), b.nextInt());
    }
}

//4. 두 개의 정수를 입력 받아서, 두 수의 최소공배수를 구하는 클래스를 작성하세요.