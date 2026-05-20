package com.sulabh.SimpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@Entity
@Data // generete all the getters and the setter for this class/
@AllArgsConstructor // generate the  constructor for this class.
@NoArgsConstructor
public class Product {
    @Id
    private int prodId;
    private String prodName;
    private int price;
}
