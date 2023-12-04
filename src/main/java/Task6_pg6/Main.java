package Task6_pg6;

public class Main {
    public static void main(String[] args) {

        Movable pointOne = new MovablePoint(1, 3, 1, 1);
        System.out.println(pointOne);
        pointOne.moveDown();

        MovablePoint point = new MovablePoint(2,2,1,1);
        Movable circOne = new MovableCircle(point, 2);
        System.out.println(circOne);
        circOne.moveDown();




    }
}
