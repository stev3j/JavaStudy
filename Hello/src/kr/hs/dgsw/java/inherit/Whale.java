package kr.hs.dgsw.java.inherit;

public class Whale extends Mammal {

    @Override
    public void move() {
        System.out.println("헤엄친다.");
    }

    public void spout() {
        System.out.println("물을 뿜는다.");
    }

    public static void main(String[] args) {
        Whale whale = new Whale();
        whale.die();
        whale.move();
        whale.spout();

        Mammal otherWhale = new Whale(); // Mammal에 있는 함수만 사용 가능, but whale에서 오버라이딩을 했다면 함수 내용 변경
        otherWhale.feed();
        otherWhale.move();
//        otherWhale.spout();

        System.out.println("----------------");
        Whale dolphin = (Whale)otherWhale;
        dolphin.spout();
    }

}
