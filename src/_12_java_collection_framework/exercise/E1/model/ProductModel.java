package _12_java_collection_framework.exercise.E1.model;

import java.util.ArrayList;
import java.util.List;

public class ProductModel {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    // Các phương thức khác để sửa, xoá sản phẩm
}
