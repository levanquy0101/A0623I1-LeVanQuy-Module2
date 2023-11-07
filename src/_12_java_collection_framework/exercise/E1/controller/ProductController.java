package _12_java_collection_framework.exercise.E1.controller;

import _12_java_collection_framework.exercise.E1.model.Product;
import _12_java_collection_framework.exercise.E1.service.ProductService;

import java.util.ArrayList;

public class ProductController {

    private ProductService service;

    public ProductController() {
        service = new ProductService();
    }

    public void add(Product product) {
        service.add(product);
    }

    public void update(int id, Product product) {
        service.update(id, product);
    }

    public void delete(int id) {
        service.delete(id);
    }

    public ArrayList<Product> getAll() {
        return service.getAll();
    }

    public Product findById(int id) {
        return service.findById(id);
    }
    public Product findByName(String name) {
        return service.findByName(name);
    }

    public ArrayList<Product> sortByPriceAsc(String order) {
        return service.sortByPriceAsc();
    }

    public ArrayList<Product> sortByPriceDesc() {
        return service.sortByPriceDesc();
    }


}

