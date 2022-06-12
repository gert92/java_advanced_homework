package task1;

public class Main {
    public static void main(String[] args) {


        Shape shape1 = new Shape();
        Shape shape2 = new Shape("blue", true);
        Shape shape3 = new Shape("red", false);
        Shape shape4 = new Shape("yellow", false);
        Shape shape5 = new Shape("brown", true);

        System.out.println(shape1);
        System.out.println(shape2);
        System.out.println(shape3);
        System.out.println(shape4);
        System.out.println(shape5);

        System.out.println();
        Circle circle = new Circle();
        Circle circle2 = new Circle("blue", true, 14);
        Circle circle3 = new Circle("red", false, 4);

        System.out.println(circle);
        System.out.println(circle2);
        System.out.println(circle3);

        System.out.println();

        Rectangle rectangle = new Rectangle();

        System.out.println(rectangle);

        System.out.println();

        Square square1 = new Square();
        Square square2 = new Square("blue", true, 2, 4);
        Square square3 = new Square("red", false, 2, 2);

        System.out.println(square1);
        System.out.println(square2);
        System.out.println(square3);
        System.out.println(square2.getArea());


    }
}
