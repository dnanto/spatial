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

    public double[][] homogenize() {
        return new double[][] { { x }, { y }, { z }, { 1 } };
    }

    public int getOctant() {
        /**/ if (x > 0 && y > 0 && z > 0)
            return 0;
        else if (x <= 0 && y > 0 && z > 0)
            return 1;
        else if (x > 0 && y <= 0 && z > 0)
            return 2;
        else if (x <= 0 && y <= 0 && z > 0)
            return 3;
        else if (x > 0 && y > 0 && z <= 0)
            return 4;
        else if (x <= 0 && y > 0 && z <= 0)
            return 5;
        else if (x > 0 && y <= 0 && z <= 0)
            return 6;
        else if (x <= 0 && y <= 0 && z <= 0)
            return 7;
        else
            return -1;
    }

    @Override
    public String toString() {
        return String.format("%s[%f,%f,%f]", this.getClass().getName(), x, y, z);
    }
}
