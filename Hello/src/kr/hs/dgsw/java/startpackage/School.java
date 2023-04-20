package kr.hs.dgsw.java.startpackage;

public class School {

    String schoolName = "대구소프트웨어마이스터고등학교";

    int countOfStudents = 0;

    void teach() {
        System.out.println("학생들을 가르칩니다.");
        System.out.printf("");
    }

    void enroll() {
        countOfStudents++;
    }

    void graduate() {
        if (countOfStudents > 0) {
            countOfStudents--;
        }
    }

    void printInformation() {
        System.out.printf("%s에는 %d명의 학생이 재학중입니다.",
                schoolName, countOfStudents);
    }

}