package kr.hs.dgsw.java.inherit;

public /*final*/ class Person {
    protected final String name; // 한번 초기화, 그 후 상수로 쭉 -

    public Person() {
        this.name = "홍길동";
    }

    public Person(String name) {
        this(3);
//        this.name = name;
    }

    public Person(int value) {
        this.name = "name";
    }

    public /*final*/ String getName() {
        return name;
    }
}