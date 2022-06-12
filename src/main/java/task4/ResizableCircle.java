package task4;

public class ResizableCircle implements Resizable{

    private double radius;

    public ResizableCircle(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void resize(int percent) {
        this.radius -= this.radius / 100 * percent;
    }
}
