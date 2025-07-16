package com.practice;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "Java is Java and Java is fun";
        String[] words = text.split(" ");
        Map<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        System.out.println(freq);
    }
}

