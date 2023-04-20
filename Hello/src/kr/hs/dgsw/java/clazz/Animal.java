package kr.hs.dgsw.java.clazz;

public class Animal {

    private String name;
    private static String category;

    public Animal() {
//        this.name = "동물";
        this("동물");
        System.out.println("생성됨");
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void printName() {
//        System.out.println(name); // static mothod는 object 변수에 접근 불가능능
    }
    public static void printCategory() {
        System.out.println(category);
    }

    public String hello() {
        return "hello";
    }

    public static void main(String[] args) {
        Animal elephant = new Animal("코끼리");
        Animal.category = "육상생물";

        System.out.printf("%s는 %s입니다.\n",
                elephant.name, elephant.category);

        Animal turtle = new Animal("거북이");
        Animal.category = "해양동물";

        System.out.printf("%s는 %s입니다.\n",
                turtle.name, turtle.category);
    }
}
