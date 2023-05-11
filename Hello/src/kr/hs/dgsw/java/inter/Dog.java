package kr.hs.dgsw.java.inter;

public class Dog implements Soundable {

    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }

    public static void main(String[] args) {
        Dog doge = new Dog();
        doge.makeSound();
    }
}
