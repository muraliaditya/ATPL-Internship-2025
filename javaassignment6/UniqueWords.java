package com.practice;
import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        String sentence = "Hip Hip Hurray";
        String sentences[]=sentence.split(" ");
        Set<String> unique = new HashSet<>(Arrays.asList(sentences));
        System.out.println(unique);
    }
}
