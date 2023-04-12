package kr.hs.dgsw.java.assignment;

public class Factorial {

    static int answer = 1;

    void factofial(int n) {
        for(int i = 2; i < n+1; i++) {
            answer *= i;
        }
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int num = 4;
        factorial.factofial(num);
        System.out.printf("%d!는 %d입니다.", num, answer);
    }
}
