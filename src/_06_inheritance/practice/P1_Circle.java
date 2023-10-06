package _06_inheritance.practice;

public class P1_Circle extends P1_Shape{
    private double radius = 1.0;
    public P1_Circle(){
    }
    public P1_Circle(double radius) {
        this.radius = radius;
    }

    public P1_Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
