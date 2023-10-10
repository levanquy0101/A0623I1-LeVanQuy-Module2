package _07_abstract_interface.exercise.E1;
import java.util.Random;
public class E1_Test {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0]= new Circle(5, "red", true);
        arr[1]= new Rectangle("yellow", false, 5, 9);
        arr[2]= new Square(15,"blue", false);

        for(Shape e : arr){
            if(!(e instanceof Square)){
                e.resize((new Random()).nextInt(100));
                System.out.println(e);
            }
        }
    }
}
