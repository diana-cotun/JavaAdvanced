package Task1_pg1;

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
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public Float[] getXYZ() {
//        super.getXY();
//        Float[] result = {super.getXY(), z};
        return new Float[]{x, y, z};
    }

    public void setXYZ(float x, float y, float z) {
       super.setXY(x, y);
       this.setZ(z);
    }
}
