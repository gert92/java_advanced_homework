package task2_3;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(0,0,2,3);
        MovableCircle movableCircle = new MovableCircle(movablePoint);


        moveLeft(movableCircle);
        moveLeft(movableCircle);
        moveUp(movableCircle);
        moveUp(movableCircle);

        moveLeft(movablePoint);
        moveRight(movablePoint);
        moveUp(movablePoint);
        moveLeft(movablePoint);
        moveLeft(movablePoint);
        moveDown(movablePoint);
        moveDown(movablePoint);
        moveUp(movablePoint);

    }

    public static void moveLeft(Movable movable){
        movable.moveLeft();
    }
    public static void moveRight(Movable movable){
        movable.moveRight();
    }
    public static void moveUp(Movable movable){
        movable.moveUp();
    }
    public static void moveDown(Movable movable){
        movable.moveDown();
    }
}
