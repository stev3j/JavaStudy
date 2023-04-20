package kr.hs.dgsw.java.startpackage;

public class SchoolDoer {
    public static void main(String[] args) {
//        School school = new School();
//        school.enroll();
//        school.enroll();
//        school.enroll();
//        school.graduate();
//
//        school.countOfStudents = 5;
//
//        school.printInformation();

        Person person = new Person();
        for (int i = 0; i < 15; i++) {
            person.aged();
        }
        person.printInformation();
    }
}