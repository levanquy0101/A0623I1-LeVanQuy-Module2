package _04_class_and_object.exercise;

public class E3_Fan {
    final int SLOW= 1,MEDIUM=2,FAST=3;
    private int speed = SLOW;
    private boolean isOn= false;
    private double radius= 5;
    private String color= "blue";

    public void setMaxSpeed(){
        this.speed = this.FAST;
    }
    public void setMediumSpeed(){
        this.speed = this.MEDIUM;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return isOn() ? String.format("Speed: %d; Color: %s; Radius: %.1f; Fan is On",speed,color,radius):String.format("Color: %s; Radius: %.1f; Fan is Off",color,radius);
    }

    public static void main(String[] args) {
        E3_Fan fan1 = new E3_Fan();
        fan1.setMaxSpeed();
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        E3_Fan fan2= new E3_Fan();
        fan2.setMediumSpeed();
        fan2.setRadius(5);

        System.out.println("Fan1: "+ fan1);
        System.out.println("Fan2 "+ fan2);
    }
}
