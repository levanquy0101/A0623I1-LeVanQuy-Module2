package _06_inheritance.exercise.E1;

import _06_inheritance.exercise.E1.E1_Circle;

public class E1_Cylinder extends E1_Circle {
    private double height;

    public E1_Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double Volume(){
        return getRadius()*getRadius()*this.height*Math.PI;
    }

    @Override
    public String toString() {
        return "E1_Cylinder{" +
                "height=" + height +
                '}';
    }

}
