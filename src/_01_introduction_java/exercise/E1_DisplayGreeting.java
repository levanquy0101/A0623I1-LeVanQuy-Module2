package _01_introduction_java.exercise;
import java.util.Scanner;

public class E1_DisplayGreeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello: " + name);
    }

}
