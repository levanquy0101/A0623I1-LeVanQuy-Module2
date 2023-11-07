package _12_java_collection_framework.exercise.E1.repository;

import _12_java_collection_framework.exercise.E1.model.Product;

import java.util.ArrayList;
import java.util.Collections;

public class ProductRepository {

    private ArrayList<Product> products;

    public ProductRepository() {
        products = new ArrayList<>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public void update(int id, Product product) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                break;
            }
        }
    }

    public void delete(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    public ArrayList<Product> getAll() {
        return products;
    }

    public Product findById(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public Product findByName(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Product> sortByPriceAsc() {
        ArrayList<Product> sortedList = new ArrayList<>(products);
        Collections.sort(sortedList, (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        return sortedList;
    }

    public ArrayList<Product> sortByPriceDesc() {
        ArrayList<Product> sortedList = new ArrayList<>(products);
        Collections.sort(sortedList, (p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
        return sortedList;
    }

}