package kr.hs.dgsw.java.startpackage;

public class Person {
    String name = "조승완";
    int age = 0;
    double height = 0.0;

    void aged() {
        age++;
        height+=6.0;
    }

    void printInformation() {
        System.out.printf("%s님의 나이는 %d살이고 키는 %.1fcm입니다.", name, age, height);
    }
}

//이름, 나이, 키