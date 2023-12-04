package Task7_pg7;

public class ResizableCircle implements Resizable{
    private double radius;

    public ResizableCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double resize(int percent) {
        return radius - (radius * (double) percent / 100);
    }
}
