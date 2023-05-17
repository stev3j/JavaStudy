package kr.hs.dgsw.java.inter;

public class Dog implements Soundable {

    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }

    @Override
    public void hello() {

    }

    public static void main(String[] args) {
        Dog doge = new Dog();
        doge.makeSound();
    }
}
