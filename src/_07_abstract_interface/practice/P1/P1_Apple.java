package _07_abstract_interface.practice.P1;

public class P1_Apple extends P1_Fruit {
    @Override
    public String howtoEat() {
        return "Apple could be slided";
    }

    @Override
    public String howToEat() {
        return null;
    }
}
