package _04_class_and_object.exercise;

import java.util.Scanner;

public class E1_QuadraticEquation {
    double a,b,c;
    public E1_QuadraticEquation(double a,double b,double c){
        this.a =a;
        this.b =b;
        this.c=c;
    }
    public double getDiscriminant(){
        return this.b*this.b - 4*this.a*this.c;
    }
    public double  getRoot1(){
        double x1;
        return x1 = (-this.b+Math.sqrt(getDiscriminant()))/2*this.a;
    }
    public double  getRoot2(){
        double x2;
        return x2 = (-this.b-Math.sqrt(getDiscriminant()))/2*this.a;
    }
    public double doubleTest(){
        double x1,x2;
        return x1=x2=-this.b/2*this.a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = input.nextDouble();
        System.out.println("Enter b:");
        double b = input.nextDouble();
        System.out.println("Enter c:");
        double c = input.nextDouble();
        E1_QuadraticEquation Resuft = new E1_QuadraticEquation(a,b,c);
        if(Resuft.getDiscriminant()>0){
            System.out.println("Phương trình có hai nghiệm phân biệt: "+Resuft.getRoot1()+" và "+Resuft.getRoot2());
        }else if(Resuft.getDiscriminant()==0){
            System.out.println("Phương trình có nghiệm kép: "+Resuft.doubleTest());
        }else {
            System.out.println("Phương trình vô nghiệm");
        }

    }
}
