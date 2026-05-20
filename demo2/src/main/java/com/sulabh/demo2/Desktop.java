package com.sulabh.demo2;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile() {
        System.out.println("Laptop compiled");
    }
}