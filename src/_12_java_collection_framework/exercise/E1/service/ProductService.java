package _12_java_collection_framework.exercise.E1.service;

import _12_java_collection_framework.exercise.E1.model.Product;
import _12_java_collection_framework.exercise.E1.repository.ProductRepository;

import java.util.ArrayList;

public class ProductService {

    private ProductRepository repo;

    public ProductService() {
        repo = new ProductRepository();
    }

    public void add(Product product) {
        repo.add(product);
    }

    public void update(int id, Product product) {
        repo.update(id, product);
    }

    public void delete(int id) {
        repo.delete(id);
    }

    public ArrayList<Product> getAll() {
        return repo.getAll();
    }

    public Product findById(int id) {
        return repo.findById(id);
    }
    public Product findByName(String name) {
        return repo.findByName(name);
    }
    public ArrayList<Product> sortByPriceAsc() {
        return repo.sortByPriceAsc();
    }

    public ArrayList<Product> sortByPriceDesc() {
        return repo.sortByPriceDesc();
    }

}