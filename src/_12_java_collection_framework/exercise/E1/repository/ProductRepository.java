package _12_java_collection_framework.exercise.E1.repository;

import _12_java_collection_framework.exercise.E1.model.Product;

public interface ProductRepository {
    Product[] fileAll();
    void addProduct(Product product);
}
