package _06_inheritance.exercise.E2;

import _06_inheritance.exercise.E2.E2_Point2D;

public class E2_Point3D extends E2_Point2D {
    private float z = 0.0f;

    public E2_Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public E2_Point3D() {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        setXY(x,y);
        this.z= z;
    }
    public float[] getXYZ(){
        float[] res= {getX(), getY(), z};
        return res;
    }

    @Override
    public String toString() {
        return "E2_Point3D{" +
                "x="+ getX() +
                ", y="+getY()+
                ", z=" + z +
                '}';
    }
}
