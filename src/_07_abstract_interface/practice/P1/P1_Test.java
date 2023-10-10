package _07_abstract_interface.practice.P1;

public class P1_Test {
    public static void main(String[] args) {
        P1_Animal[] animals = new P1_Animal[2];
        animals[0] = new P1_Tiger();
        animals[1] = new P1_Chicken();
        for (P1_Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof P1_Chicken) {
                P1_Edible edibler = (P1_Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
