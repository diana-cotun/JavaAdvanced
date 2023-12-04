package Task6_pg6;

public class MovableCircle implements Movable{

    private MovablePoint movablePoint;
    private double radius;

    public MovableCircle(MovablePoint movablePoint, double radius) {
        this.movablePoint = movablePoint;
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        movablePoint.moveUp();
    }

    @Override
    public void moveDown() {
        System.out.println(movablePoint.getY() - movablePoint.getySpeed());
    }

    @Override
    public void moveLeft() {
        movablePoint.moveLeft();
    }

    @Override
    public void moveRight() {
        movablePoint.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "movablePoint=" + movablePoint +
                ", radius=" + radius +
                '}';
    }
}
