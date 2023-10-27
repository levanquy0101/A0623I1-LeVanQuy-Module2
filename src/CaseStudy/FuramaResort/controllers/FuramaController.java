package CaseStudy.FuramaResort.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Menu chức năng:\n"+
                "1. Employee Management\n" +
                "2. Customer Management\n" +
                "3. Facility Management\n" +
                "4. Booking Management\n" +
                "5. Promotion Management\n" +
                "6. Exit");
        System.out.println("Nhập Số:");

    }

    public static void main(String[] args) {
        displayMainMenu();

    }
}
