package _06_inheritance.practice;

public class P1_ShapeTest {
    public class ShapeTest {
        public static void main(String[] args) {
            P1_Shape shape = new P1_Shape();
            System.out.println(shape);

            shape = new P1_Shape("red", false);
            System.out.println(shape);
        }
    }
}
