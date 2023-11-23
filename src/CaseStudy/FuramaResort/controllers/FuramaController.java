package CaseStudy.FuramaResort.controllers;

import CaseStudy.FuramaResort.models.Employee;
import CaseStudy.FuramaResort.services.EmployeeService;
import CaseStudy.FuramaResort.services.EmployeeServiceImpl;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static CaseStudy.FuramaResort.views.DisplayMenu.displayMainMenu;

public class FuramaController {
    private static EmployeeService employeeService = new EmployeeServiceImpl();
    private static final String FILE_PATH = "D:\\Codegym\\A0623I1-LeVanQuy-Module2\\src\\CaseStudy\\FuramaResort\\data\\EmployeeCSV.csv";
    public static void displayEmployeeManagementMenu() throws IOException {

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
                List<Employee> employees = employeeService.getAllEmployees();
                for (Employee employee : employees) {
                    System.out.println(employee);
                }
                break;
            case 2:
                // Logic to add a new employee
                scanner.nextLine();
                System.out.println("Nhập tên: ");
                String name = scanner.nextLine();
                System.out.println("Nhập ngày sinh: ");
                String date = scanner.nextLine();
                System.out.println("Nhập giới tính: ");
                String sex = scanner.nextLine();
                System.out.println("Nhập cmnd: ");
                int cmnd = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập số điện thoại: ");
                int phone = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập email: ");
                String email = scanner.nextLine();
                System.out.println("Nhập idEmployee: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập cấp bậc: ");
                String level = scanner.nextLine();
                System.out.println("Nhập position: ");
                String position = scanner.nextLine();
                System.out.println("Nhập lương: ");
                int salary = Integer.parseInt(scanner.nextLine());
                Employee newEmployee = new Employee(name, date, sex,cmnd, phone, email, id, level, position, salary);
                employeeService.addEmployee(newEmployee);
                System.out.println("Thêm nhân viên thành công!");
                System.out.println("------------------------------");
                write(newEmployee);

                displayEmployeeManagementMenu();
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

    public static void displayCustomerManagementMenu() throws IOException {
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

    public static void displayFacilityManagementMenu() throws IOException {
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

    public static void displayBookingManagementMenu() throws IOException {
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

    public static void displayPromotionManagementMenu() throws IOException {
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
    private static void write(Employee employee) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH);
        BufferedWriter buff =new BufferedWriter(fileWriter);
        buff.write(employee.getName());
        buff.flush();
        buff.close();
    }
}