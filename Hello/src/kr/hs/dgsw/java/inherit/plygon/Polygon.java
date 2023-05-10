package kr.hs.dgsw.java.inherit.plygon;

public abstract class Polygon {

    protected final String name; // final 상수

    public Polygon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getSize();
}