package _12_java_collection_framework.exercise.E1.view;

import _12_java_collection_framework.exercise.E1.controller.ProductController;
import _12_java_collection_framework.exercise.E1.model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {
    private ProductController controller;

    public ProductView() {
        controller = new ProductController();
    }

    public static void main(String[] args) {
        ProductView view = new ProductView();
        view.showMenu();
    }

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM");
            System.out.println("---------------------------");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Cập nhật sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Tìm kiếm sản phẩm");
            System.out.println("5. Hiển thị danh sách sản phẩm");
            System.out.println("6. Sắp xếp sản phẩm");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            if (choice == 0) {
                break;
            }
            performAction(choice);
        }
    }

    public void performAction(int choice) {
        Scanner sc = new Scanner(System.in);
        switch (choice) {
            case 1:
                addProduct();
                break;
            case 2:
                updateProduct();
                break;
            case 3:
                deleteProduct();
                break;
            case 4:
                searchProduct();
                break;
            case 5:
                showProducts();
                break;
            case 6:
                sortProducts();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    }

    private void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID sản phẩm: ");
        int id = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng mới sau khi nhập số
        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        double price = sc.nextDouble();
        Product p = new Product(id, name, price);
        controller.add(p);
    }

    private void updateProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID sản phẩm cần cập nhật: ");
        int id = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng mới sau khi nhập số
        System.out.print("Nhập tên sản phẩm mới: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá sản phẩm mới: ");
        double price = sc.nextDouble();
        Product p = new Product(id, name, price);
        controller.update(id, p);
    }

    private void deleteProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID sản phẩm cần xóa: ");
        int id = sc.nextInt();
        controller.delete(id);
    }

    private void searchProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm cần tìm kiếm: ");
        String name = sc.nextLine();
        Product p = controller.findByName(name);
        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("Không tìm thấy sản phẩm!");
        }
    }

    private void showProducts() {
        ArrayList<Product> products = controller.getAll();
        for (Product p : products) {
            System.out.println(p);
        }
    }

    private void sortProducts() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập thứ tự sắp xếp (asc/desc): ");
        String order = sc.nextLine();
        ArrayList<Product> products = controller.sortByPriceAsc(order);
        for (Product p : products) {
            System.out.println(p);
        }
    }
}