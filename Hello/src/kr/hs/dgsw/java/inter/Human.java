package kr.hs.dgsw.java.inter;

public class Human implements Sing {

    @Override
    public void sing() {
        System.out.println("랄랄라~~");
    }

    @Override
    public void makeSound() {
        System.out.println("헤헤");
    }

    @Override
    public void hello() {
        System.out.println("여~");
    }
}
