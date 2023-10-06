package _06_inheritance.exercise.E3;

public class E3_MoveablePoint extends E3_Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public E3_MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public E3_MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public E3_MoveablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed= xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] res = {xSpeed,ySpeed};
        return res;
    }
    public E3_MoveablePoint move(){
        setX(getX()+ xSpeed);
        setY(getY()+ ySpeed);
        return this;
    }
    @Override
    public String toString() {
        return "E3_MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
