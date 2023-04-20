package kr.hs.dgsw.java.inherit;

public class Mammal extends Animal {

    public void feed() {
        System.out.println("젖을 먹인다.");
    }

    public void birth() {
        System.out.println("태생으로 자식을 낳는다.");
    }

    @Override
    public void move() {
        super.move(); // 상속된 Animal의 move함수
        System.out.println("빠르게 움직인다.");
    }

    public static void main(String[] args) {
        Mammal mammal = new Mammal();

        mammal.feed();
        mammal.birth();
        mammal.move();

        Animal lion = new Mammal(); // 다형성, 객체는 Animal 타입인데 함수는 Mammal 거임?
        lion.move();

//        Mammal dog = new Animal(); // Mammeal 에는 있는 함수가 Animal에는 없기 때문에 -> 에러 발생
    }
}
