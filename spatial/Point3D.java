package spatial;

public class Point3D {
    public double x;
    public double y;
    public double z;

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("%s[%f,%f,%f]", this.getClass().getName(), this.x, this.y, this.z);
    }
}
