package com.practice;
import java.util.*;

public class CustomerService {
    Queue<String> queue = new LinkedList<>();

    public void addCustomer(String name) {
        queue.add(name);
    }

    public String serveCustomer() {
        return queue.remove(); 
    }

    public String peekNextCustomer() {
        return queue.peek(); 
    }

    public static void main(String[] args) {
        CustomerService cs = new CustomerService();
        cs.addCustomer("Ram");
        cs.addCustomer("Raj");
        cs.addCustomer("Jay");
        cs.addCustomer("Dev");

        System.out.println("Next: " + cs.peekNextCustomer()); 
        System.out.println("Served: " + cs.serveCustomer());
        System.out.println("Next: " + cs.peekNextCustomer());
        System.out.println("Served: " + cs.serveCustomer());
        System.out.println("Next: " + cs.peekNextCustomer());
        System.out.println("Served: " + cs.serveCustomer());
        System.out.println("Next: " + cs.peekNextCustomer());
        System.out.println("Served: " + cs.serveCustomer());
        System.out.println("Next: " + cs.peekNextCustomer());
    }
}