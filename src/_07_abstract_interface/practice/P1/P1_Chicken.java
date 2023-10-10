package _07_abstract_interface.practice.P1;

public class P1_Chicken extends P1_Animal implements P1_Edible {

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howtoEat() {
        return null;
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
