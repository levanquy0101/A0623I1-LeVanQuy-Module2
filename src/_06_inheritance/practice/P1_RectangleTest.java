package _06_inheritance.practice;

public class P1_RectangleTest {
    public static void main(String[] args) {
        P1_Rectangle rectangle = new P1_Rectangle();
        System.out.println(rectangle);

        rectangle = new P1_Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new P1_Rectangle("orange", false, 2.5, 3.8);
        System.out.println(rectangle);
    }
}
