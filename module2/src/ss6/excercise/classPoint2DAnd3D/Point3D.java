package ss6.excercise.classPoint2DAnd3D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arrxyz = {super.getX(), super.getX(), this.z};
        return arrxyz;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", z=" + z ;
    }
}
