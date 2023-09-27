package _05_access_modifier_static.exercise;

public class E1_AccessModifier {
    private double radius = 1.0;
    private String color = "red";
    public E1_AccessModifier() {
    }
    public E1_AccessModifier(double radius) {
        this.radius = radius;
    }

    // Phương thức getter
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Phương thức setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        E1_AccessModifier circle = new E1_AccessModifier();
        System.out.println("Bán kính hình tròn: " + circle.getRadius());
        System.out.println("Màu sắc hình tròn: " + circle.getColor());
        System.out.println("Diện tích hình tròn: " + circle.getArea());

        circle.setRadius(5);
        circle.setColor("blue");

        System.out.println("Bán kính hình tròn: " + circle.getRadius());
        System.out.println("Màu sắc hình tròn: " + circle.getColor());
        System.out.println("Diện tích hình tròn: " + circle.getArea());

    }
}
