package Task1_pg1.Refacere;

import java.util.ArrayList;
import java.util.List;

public class Point3D extends Point2D{

    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        setZ(z);
    }
    public List<Float> getXYZ() {
        List<Float> result = new ArrayList<>();
        result.add(x);
        result.add(y);
        result.add(z);
        return result;
    }




}
