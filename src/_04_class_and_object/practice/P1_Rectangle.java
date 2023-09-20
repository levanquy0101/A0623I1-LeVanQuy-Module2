package _04_class_and_object.practice;

public class P1_Rectangle {
    double width, height;
    public P1_Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public  double getPerimeter(){
        return (this.width +this.height)*2;
    }
    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

}
