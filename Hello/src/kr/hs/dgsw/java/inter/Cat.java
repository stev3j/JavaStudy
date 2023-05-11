package kr.hs.dgsw.java.inter;

public class Cat implements Soundable, Jumpable{
    // interface는 inplements로 상속받음

    @Override
    public void makeSound() {
        System.out.println("야아옹~");
    }

    @Override
    public void hello() {
        System.out.println("안녕~!");
    }

    @Override
    public void jump() {
        System.out.println("폴짝!");
    }

    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.makeSound();
        tom.jump();

        Dog doge = new Dog();
        doge.makeSound();

        Soundable pat = new Dog();
        pat.makeSound();
        pat.hello();

        Soundable cat = new Cat();
//        cat.jump()  // 이건 안됨

        Jumpable cat2 = new Cat();
        cat2.jump();
        cat2.hello();
    }
}
