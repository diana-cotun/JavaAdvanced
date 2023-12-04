package Task1_pg1.Refacere;

import java.util.ArrayList;
import java.util.List;

public class Point2D {

    protected float x;
    protected float y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public List<Float> getXY() {
        List<Float> result = new ArrayList<>();
        result.add(x);
        result.add(y);
        return result;
    }

    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }


}
