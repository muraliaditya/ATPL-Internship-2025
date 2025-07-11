package com.practice;

import java.util.*;
public class DuplicateRemover {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);
        numbers.add(7);
        System.out.println(numbers);
        Set<Integer> unique = new HashSet<>(numbers);
        System.out.println(unique);
    }
}

