package _06_inheritance.exercise.E1;

import _06_inheritance.exercise.E1.E1_Circle;
import _06_inheritance.exercise.E1.E1_Cylinder;

public class E1_Test {
    public static void main(String[] args) {
        E1_Circle circle1 = new E1_Circle(8,"red");
        System.out.println(circle1);
        System.out.println("Diện tích hình tròn là: "+circle1.Area());
        E1_Cylinder cylinder1 =new E1_Cylinder(8,"red",4);
        System.out.println(cylinder1);
        System.out.println("Thể tích hình trụ là: "+cylinder1.Volume());
    }
}
