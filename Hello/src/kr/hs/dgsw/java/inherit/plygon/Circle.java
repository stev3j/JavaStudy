package kr.hs.dgsw.java.inherit.plygon;

public class Circle extends Polygon{

    protected final double radius;

    // 부모의 생성자를 따라가긴 해야해서 String name을 추가함
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getSize() {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Polygon circle = new Circle("원", 3); // Polygon 형식으로 받는 이유는? 그냥 이것도 가능하다는 의미 (잘 안 씀)

        double size = circle.getSize();
        System.out.println(size);
    }
}
