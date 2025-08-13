package com.aaslin.spring.speldemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {

    @Value("Laptop")
    private String name;

    @Value("75000")
    private double price;

    @Value("#{${discountPercent:10} / 100 * ${price:75000}}")
    private double discountedPrice;

    @Value("true")
    private boolean inStock;

    @Value("#{${inStock:true} ? 'Available in stock' : 'Currently out of stock'}")
    private String availabilityMessage;

    public void printDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Discounted Price: ₹" + discountedPrice);
        System.out.println("In Stock: " + inStock);
        System.out.println("Availability Message: " + availabilityMessage);
    }
}
