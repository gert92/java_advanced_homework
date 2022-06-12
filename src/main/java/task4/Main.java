package task4;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(15);

        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        ResizableCircle circle1 = new ResizableCircle(15);
        circle1.resize(15);
        System.out.println(circle1.getRadius());
    }
}
