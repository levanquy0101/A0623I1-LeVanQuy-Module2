package _07_abstract_interface.exercise.E2;

public class Square extends Rectangle implements Colorable {

    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}