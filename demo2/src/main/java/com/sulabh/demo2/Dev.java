package com.sulabh.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired //  ok so what does autowire do , it tells to the spring that when we create the object of Dev
    // connect this class to the Laptop class so that it uses the object of the Laptop

    // when Spring creates Dev bean, inject the Laptop bean from IoC container into this field

    // A bean is an object, but with one extra meaning: A Spring Bean
    // is an object that is created, managed, and controlled by the Spring IoC container.
    @Qualifier("laptop")
    private Computer comp;

    // there are two classes that implements the computer one is laptop and other is desktop so spring
    // confuses about which bean to use. for that either we use primary annotation to make one primary
    // and other way os to make the Qualifier in this file itself.

    public void build() {
        comp.compile();
        System.out.println("Dev has been built.");
    }
}
