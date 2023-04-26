package kr.hs.dgsw.java.inherit;

public class Student extends Person {

    // 부모에 기본 생성자가 없을 시 -> 자식 클래스에서 한 번 호출해야함.
    public Student(String name) {
        super(name); //
    }

    public Student(int value) {
        super("");
    }

    @Override
    public String getName() {
//        return "나의 이름은" + this.name + "입니다.";
        return "나의 이름은" + super.getName() + "입니다."; // super. : 부모의 ~
    }
}
