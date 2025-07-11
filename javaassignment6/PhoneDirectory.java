package com.practice;
import java.util.*;

public class PhoneDirectory {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("RAM", "1234567899");
        phoneBook.put("SITA", "1234567898");

        System.out.println("RAM's number: " + phoneBook.get("RAM"));

        phoneBook.remove("RAM");
        System.out.println("RAM's number: " + phoneBook.get("RAM"));
    }
}
