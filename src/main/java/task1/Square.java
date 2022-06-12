package task1;

public class Square extends Rectangle{
    public Square() {
        this.setColor("unknown");
        this.setFilled(false);
        this.setLength(1);
        this.setWidth(1);
    }

    public Square(String color, boolean isFilled, double width, double length) {
        super(color, isFilled, width, length);
        setWidth((width + length) / 2);
        setLength((width + length) / 2);
    }

    @Override
    public String toString() {
        return "Square with width="
                + this.getWidth() + " and length="
                + this.getLength() + " which is a subclass of "
                + this.getClass().getSuperclass().getSimpleName();
    }



}
