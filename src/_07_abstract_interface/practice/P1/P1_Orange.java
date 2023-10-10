package _07_abstract_interface.practice.P1;

import _07_abstract_interface.practice.P1.P1_Fruit;

public class P1_Orange extends P1_Fruit {
    @Override
    public String howtoEat() {
        return "Orange could be juiced";
    }

    @Override
    public String howToEat() {
        return null;
    }
}
