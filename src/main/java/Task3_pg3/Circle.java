package Task3_pg3;

public class Circle extends Shape{

    private double radius;

    public Circle() {
    }
//    non-arguments constructor which will set: the color field value to unknown, the isFilled field value to false,
//    and the radius field value to 1.

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", isFilled=" + isFilled +
                '}';
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (radius * 2);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

//        public double getArea() {
//        return Math.PI * Math.pow(radius, 2);
//    }
//    public double getPerimeter() {
//        return Math.PI * (radius * 2);
//    }
}
