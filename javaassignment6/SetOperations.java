package com.practice;
import java.util.*;
public class SetOperations {
	public static void main(String args[]) {
		Set<Integer> set1=new HashSet<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		Set<Integer> set2=new HashSet<Integer>();
		set2.add(50);
		set2.add(30);
		set2.add(80);
		Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Intersection: " + intersection);
        System.out.println("Union: " + union);
        System.out.println("Difference: " + difference);
	}

}
