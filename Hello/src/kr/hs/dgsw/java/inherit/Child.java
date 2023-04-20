package kr.hs.dgsw.java.inherit;

public class Child extends Parent {

    private int value4;
    private int value2;

    public static void main(String[] args) {
        Child child = new Child();
//        child.value1 = 2;
        child.value2 = 5; // Child에서 선언한 변수임
        child.value3 = 6;
        child.value4 = 8;

        child.setValue1(4);
        child.setValue2(25);

        System.out.println(child.value3);
        System.out.println(child.value2);
//        System.out.println(child.value1); // private value
        System.out.println(child.value4);

        System.out.println("합 : " + child.add());
    }
}

