package task1;

public class Circle extends Shape{
    private int radius;

    public Circle(String color, boolean isFilled, int radius) {
        super(color, isFilled);
        this.radius = radius;
    }
    public Circle() {
        this.setFilled(false);
        this.setColor("unknown");
        this.radius = 1;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * (radius * radius);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius=" + radius + " which is a subclass of " + this.getClass().getSuperclass().getSimpleName();
    }
}
