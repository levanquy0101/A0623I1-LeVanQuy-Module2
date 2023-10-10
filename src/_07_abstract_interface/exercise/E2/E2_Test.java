package _07_abstract_interface.exercise.E2;

public class E2_Test {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.0);
        shapes[1] = new Rectangle(2.0, 4.0);
        shapes[2] = new Square(5.0);

        for(Shape shape: shapes) {
            System.out.println(shape.getArea());
            if(shape instanceof Colorable) {
                ((Colorable)shape).howToColor();
            }
        }
    }

}
