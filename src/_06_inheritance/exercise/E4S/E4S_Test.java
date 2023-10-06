package _06_inheritance.exercise.E4S;

public class E4S_Test {
    public static void main(String[] args) {
        E4S_Triangle triangle1 = new E4S_Triangle(3,7,9,"red");
        System.out.println("Màu sắc là: "+triangle1.getColor());
        System.out.println("Chu vi là: "+triangle1.getPerimeter());
        System.out.println("Diện tích là: "+triangle1.getArea());
    }
}
