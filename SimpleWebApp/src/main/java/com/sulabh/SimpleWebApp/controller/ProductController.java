package com.sulabh.SimpleWebApp.controller;

import com.sulabh.SimpleWebApp.model.Product;
import com.sulabh.SimpleWebApp.service.ProductsService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {

    @Autowired
    ProductsService service;

    @GetMapping("/products")
    public List<Product> getProduct() {
        return service.getProducts();
    }

    @GetMapping("products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }

    // note the work of converting java object into the json and
    // vice versa is done my jackson library.
    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
        service.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product) {
        service.updateProduct(product);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProductById(@PathVariable int prodId) {
        service.deleteProduct( prodId);
    }
}

