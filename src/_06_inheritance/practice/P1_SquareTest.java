package _06_inheritance.practice;

public class P1_SquareTest {
    public static void main(String[] args) {
        P1_Square square = new P1_Square();
        System.out.println(square);

        square = new P1_Square(2.3);
        System.out.println(square);

        square = new P1_Square(5.8, "yellow", true);
        System.out.println(square);
    }
}