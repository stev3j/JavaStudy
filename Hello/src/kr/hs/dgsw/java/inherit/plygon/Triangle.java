package kr.hs.dgsw.java.inherit.plygon;

public class Triangle extends Rectangle{

    public Triangle(String name, double width, double height) {
        super(name, width, height);
    }

    @Override
    public double getSize() {
        return width * height / 2;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle("삼각형", 6, 8);

        double size = triangle.getSize();
        System.out.println(size);
    }
}
