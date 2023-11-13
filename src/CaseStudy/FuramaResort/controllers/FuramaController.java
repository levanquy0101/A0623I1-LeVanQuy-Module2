package CaseStudy.FuramaResort.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();

    }

    public static void displayMainMenu() {
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

    public static void displayEmployeeManagementMenu() {
        System.out.println("Employee Management Menu:");
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Return to main menu");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Logic to display list of employees
                break;
            case 2:
                // Logic to add a new employee
                break;
            case 3:
                // Logic to edit an employee
                break;
            case 4:
                displayMainMenu();
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
                displayEmployeeManagementMenu();
                break;
        }
    }

    public static void displayCustomerManagementMenu() {
        System.out.println("Customer Management Menu:");
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Return to main menu");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Logic to display list of customers
                break;
            case 2:
                // Logic to add a new customer
                break;
            case 3:
                // Logic to edit a customer
                break;
            case 4:
                displayMainMenu();
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
                displayCustomerManagementMenu();
                break;
        }
    }

    public static void displayFacilityManagementMenu() {
        System.out.println("Facility Management Menu:");
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Return to main menu");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Logic to display list of facilities
                break;
            case 2:
                // Logic to add a new facility
                break;
            case 3:
                // Logic to display list of facility maintenance
                break;
            case 4:
                displayMainMenu();
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
                displayFacilityManagementMenu();
                break;
        }
    }

    public static void displayBookingManagementMenu() {
        System.out.println("Booking Management Menu:");
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new contracts");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return to main menu");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Logic to add a new booking
                break;
            case 2:
                // Logic to display list of bookings
                break;
            case 3:
                // Logic to create new contracts
                break;
            case 4:
                // Logic to display list of contracts
                break;
            case 5:
                // Logic to edit contracts
                break;
            case 6:
                displayMainMenu();
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
                displayBookingManagementMenu();
                break;
        }
    }

    public static void displayPromotionManagementMenu() {
        System.out.println("Promotion Management Menu:");
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers get voucher");
        System.out.println("3. Return to main menu");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Logic to display list of customers using service
                break;
            case 2:
                // Logic to display list of customers getting voucher
                break;
            case 3:
                displayMainMenu();
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
                displayPromotionManagementMenu();
                break;
        }
    }
}