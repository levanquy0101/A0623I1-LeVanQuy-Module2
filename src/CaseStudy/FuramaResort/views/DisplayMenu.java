package CaseStudy.FuramaResort.views;

import java.io.IOException;
import java.util.Scanner;
import static CaseStudy.FuramaResort.controllers.FuramaController.*;

public class DisplayMenu {
    public static void main(String[] args) throws IOException {
        displayMainMenu();
    }
    public static void displayMainMenu() throws IOException {
        System.out.println("Main Menu:");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                displayEmployeeManagementMenu();
                break;
            case 2:
                displayCustomerManagementMenu();
                break;
            case 3:
                displayFacilityManagementMenu();
                break;
            case 4:
                displayBookingManagementMenu();
                break;
            case 5:
                displayPromotionManagementMenu();
                break;
            case 6:
                System.out.println("Exiting the program...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
                displayMainMenu();
                break;
        }
    }

}
