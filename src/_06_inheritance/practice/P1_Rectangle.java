package _06_inheritance.practice;

public class P1_Rectangle extends P1_Shape{
    private double width;
    private double height;

    public P1_Rectangle(){
        width= 1;
        height= 1;
    }

    public P1_Rectangle(double width, double length) {
        this.width = width;
        this.height = length;
    }

    public P1_Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "A Rectangle with width= " + width +
                ", height= " + height + " which is a subclass of "+ super.toString();
    }
}
