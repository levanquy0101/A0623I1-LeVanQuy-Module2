package _17_BinaryFile_Serialization.exercise.E1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product implements Serializable {
    private String code;
    private String name;
    private String manufacturer;
    private double price;
    private String description;

    public Product(String code, String name, String manufacturer, double price, String description) {
        this.code = code;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    // Constructors, getters, and setters

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}

class ProductManager {
    private List<Product> products;
    private String filePath;

    public ProductManager(String filePath) {
        this.products = new ArrayList<>();
        this.filePath = filePath;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public Product searchProductByCode(String code) {
        for (Product product : products) {
            if (product.getCode().equals(code)) {
                return product;
            }
        }
        return null;
    }

    public Product searchProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void saveToFile() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(products);
            System.out.println("File saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFromFile() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            products = (List<Product>) inputStream.readObject();
            System.out.println("File loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String filePath = "D:\\Codegym\\A0623I1-LeVanQuy-Module2\\src\\_17_BinaryFile_Serialization\\exercise\\E1\\product.txt";
        ProductManager productManager = new ProductManager(filePath);

        Scanner scanner = new Scanner(System.in);

        // Thêm sản phẩm mới
        System.out.println("Nhập thông tin sản phẩm mới:");
        System.out.print("Mã sản phẩm: ");
        String code = scanner.nextLine();
        System.out.print("Tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Hãng sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Giá: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Đọc ký tự new line sau khi nhập số
        System.out.print("Mô tả: ");
        String description = scanner.nextLine();

        Product product = new Product(code, name, manufacturer, price, description);
        productManager.addProduct(product);

        // Lưu thông tin sản phẩm vào file
        productManager.saveToFile();

        // Hiển thị danh sách sản phẩm
        productManager.displayProducts();

        // Tìm kiếm sản phẩm theo mã
        System.out.print("Nhập mã sản phẩm cần tìm: ");
        String searchCode = scanner.nextLine();
        Product foundProduct = productManager.searchProductByCode(searchCode);
        if (foundProduct != null) {
            System.out.println("Sản phẩm được tìm thấy: " + foundProduct);
        } else {
            System.out.println("Không tìm thấy sản phẩm.");
        }

        // Tìm kiếm sản phẩm theo tên
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String searchName = scanner.nextLine();
        foundProduct = productManager.searchProductByName(searchName);
        if (foundProduct != null) {
            System.out.println("Sản phẩm được tìm thấy: " + foundProduct);
        } else {
            System.out.println("Không tìm thấy sản phẩm.");
        }

        // Đọc thông tin sản phẩm từ file
        productManager.loadFromFile();

        // Hiển thị danh sách sản phẩm sau khi đọc từ file
        productManager.displayProducts();
    }
}