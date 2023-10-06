package _06_inheritance.practice;

public class P1_Shape {
    private String color="green";
    private boolean filled = true;
    protected P1_Shape(){
    }
    public P1_Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public P1_Shape(String color) {
        this.color =color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}
