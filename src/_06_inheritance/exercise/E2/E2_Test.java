package _06_inheritance.exercise.E2;

import _06_inheritance.exercise.E2.E2_Point2D;
import _06_inheritance.exercise.E2.E2_Point3D;

import java.util.Arrays;

public class E2_Test {
    public static void main(String[] args) {
        E2_Point2D point2D = new E2_Point2D(4,3);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));

        E2_Point3D point3D = new E2_Point3D(4,5,6);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
