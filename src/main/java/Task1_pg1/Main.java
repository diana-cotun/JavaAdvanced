package Task1_pg1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Point2D point = new Point2D(2, 5);
        point.getXY();

        Point3D point1 = new Point3D(2, 3, 4);
        System.out.println(Arrays.toString(point.getXY()));
        System.out.println(Arrays.toString(point1.getXYZ()));

        point1.setXYZ(3,3,3);
        System.out.println(point1);

        System.out.println(Arrays.toString(point.getXY()));



    }
}
