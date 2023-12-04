package Task7_pg7;

public class Circle implements GeometricObject{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
