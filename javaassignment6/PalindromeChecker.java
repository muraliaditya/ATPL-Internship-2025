package com.practice;
import java.util.*;
public class PalindromeChecker {
	public static void main(String[] args) {
	    String word="MADAM";  	
	     Deque<Character> deque = new LinkedList<>();
	        for (char c : word.toCharArray()) {
	            deque.add(c);
	        }
	        while (deque.size() > 1) {
	            if (deque.pollFirst() != deque.pollLast()) {
	                System.out.println(false);
	                System.exit(0);
	            }
	        }
	        System.out.println(true);
	        
	    }
}
 