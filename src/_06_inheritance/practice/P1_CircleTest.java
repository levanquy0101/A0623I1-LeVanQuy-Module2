package _06_inheritance.practice;

public class P1_CircleTest {
    public static void main(String[] args) {
        P1_Circle circle = new P1_Circle();
        System.out.println(circle);

        circle = new P1_Circle(3.5);
        System.out.println(circle);

        circle = new P1_Circle("indigo",false,3.5);
        System.out.println(circle);
    }
}
