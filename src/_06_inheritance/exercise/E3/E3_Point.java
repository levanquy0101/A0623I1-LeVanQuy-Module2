package _06_inheritance.exercise.E3;

public class E3_Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public E3_Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public E3_Point() {
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
    public float[] getXY(){
        float[] res = {x,y};
        return res;
    }
    public void setXY(float x, float y){
        this.x =x;
        this.y =y;
    }

    @Override
    public String toString() {
        return "E3_Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
