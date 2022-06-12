package task2_3;

public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    @Override
    public void moveUp() {
        y += ySpeed;
        System.out.println("y:" + y);
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
        System.out.println("y:" + y);
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
        System.out.println("x:" + x);
    }

    @Override
    public void moveRight() {
        x += xSpeed;
        System.out.println("x:" + x);
    }
}
