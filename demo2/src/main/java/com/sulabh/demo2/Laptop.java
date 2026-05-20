package com.sulabh.demo2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // tells Spring IoC container to create and manage an object/bean of this class
//@Primary // in case of confusion this class will be preffered.
// if not used primary here so we can use @Qualiefile
public class Laptop implements Computer {
    public void compile() {
        System.out.println("Laptop compiled");
    }
}