package com.sulabh.SimpleWebApp.service;

import com.sulabh.SimpleWebApp.model.Product;
import com.sulabh.SimpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductsService {

    @Autowired
    ProductRepo repo;

//    List<Product> productsList = new ArrayList<>(
//        Arrays.asList(
//            new Product(101, "Mobile", 5000),
//            new Product(102, "Laptop", 50000)
//        )
//    );
    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product product) {
        repo.save(product);
    }

    public void updateProduct(Product product) {
        repo.save(product);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
