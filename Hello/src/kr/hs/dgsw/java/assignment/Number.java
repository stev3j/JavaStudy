package kr.hs.dgsw.java.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Number {

    void check(int num) {
        ArrayList<Integer> divisorList = new ArrayList<Integer>();
        for(int i = 1; i < num/2+1; i++) {
            if (num % i == 0) {
                divisorList.add(i);
            }
        }
        if (divisorList.stream().mapToInt(Integer::intValue).sum() == num) {
            System.out.println("완전수입니다");
        } else {
            System.out.println("완전수가 아니야!");
        }
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Number number = new Number();

        number.check(num.nextInt());
    }
}


//3. 임의의 정수를 입력하여서, 그 수가 완전수인지 아닌지 여부를 판단하는 프로그램을 작성하세요.
//        완전수라 함은 그 수의 모든 약수의 합이 그 수와 같은 수를 뜻합니다.
//        예를 들어 6의 약수는 1, 2, 3 이고 이를 다 더하면 6이 되어서 6은 완전수입니다.