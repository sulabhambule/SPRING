package com.sulabh.SimpleWebApp.repository;

import com.sulabh.SimpleWebApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    // we can write here the customized methods, rest methods are given by teh Spring data JPA
}
