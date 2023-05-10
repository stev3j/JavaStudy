package kr.hs.dgsw.java.inherit.plygon;

public class Rectangle extends Polygon {

    protected final double width;
    protected final double height;

    // 자식은 부모의 생성자를 무조건 1번 실행 시켜야 한다.
    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public double getSize() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("직사각형", 1, 7);

        rectangle.getName();
    }

}
