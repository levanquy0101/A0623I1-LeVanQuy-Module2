package _05_access_modifier_static.practice;

class Car {
    private String name;
    private String engine;
    public static int numberOfCars;

    public Car(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;
    }



    // getters and setters

}
public class P2_StaticProperty {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3","Skyactiv 3");

        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6","Skyactiv 6");

        System.out.println(Car.numberOfCars);

    }
}
