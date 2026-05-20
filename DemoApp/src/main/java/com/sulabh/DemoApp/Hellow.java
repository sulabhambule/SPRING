package com.sulabh.DemoApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellow {

    @RequestMapping
    public String greet() {
        return "hellow World";
    }

}
