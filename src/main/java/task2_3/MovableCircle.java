package task2_3;

public class MovableCircle implements Movable{

    private MovablePoint movablePoint;

    public MovableCircle(MovablePoint movablePoint) {
        this.movablePoint = movablePoint;
    }

    @Override
    public void moveUp() {
       movablePoint.setY(movablePoint.getY() + movablePoint.getySpeed());
    }

    @Override
    public void moveDown() {
        movablePoint.setY(movablePoint.getY() - movablePoint.getySpeed());

    }

    @Override
    public void moveLeft() {
        movablePoint.setX(movablePoint.getX() - movablePoint.getxSpeed());

    }

    @Override
    public void moveRight() {
        movablePoint.setX(movablePoint.getX() + movablePoint.getxSpeed());
    }
}
