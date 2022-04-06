package _06_inheritance.exercise.point_2d_point_3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y) {
        super(x, y);
    }

    public Point3D(float z) {
        this.z = z;
    }

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
    public void setXYZ(){
    }
    public float[] getXYZ(){
        return new float[]{ this.getX(), this.getY() ,this.getZ()};
    }

    @Override
    public String toString() {
        return "("+ super.getX()+","+super.getY()+"," +z+")";
    }
}
