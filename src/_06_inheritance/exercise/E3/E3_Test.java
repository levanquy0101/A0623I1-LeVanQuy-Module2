package _06_inheritance.exercise.E3;

public class E3_Test {
    public static void main(String[] args) {
        E3_Point point1 = new E3_Point(3,4);
        System.out.println(point1);
        E3_MoveablePoint moveablePoint1= new E3_MoveablePoint(7,5,8,1);
        System.out.println(moveablePoint1.move());
    }
}
