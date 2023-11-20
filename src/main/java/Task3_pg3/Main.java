package Task3_pg3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("red", true, 4);
        circle.setRadius(2);
        System.out.println("Circle area is: " + circle.getArea());

        Shape circleX = new Circle("blue", false, 3);
        System.out.println("Circle perimeter is: " + circleX.getPerimeter());
//        circleX.getArea(); -> de ce nu pot apela metoda pe obiectul Circle de Shape ???

        Shape rectangle = new Rectangle(2, 2);
        System.out.println("Rectangle area is: " + rectangle.getArea());

    }
}
