package com.practice;
import java.util.*;
public class PriorityQueue {
	public static void main(String[] args) {
	        Queue<String> printQueue = new LinkedList<>();

	        printQueue.add("Doc1");
	        printQueue.add("Doc2");
	        printQueue.add("Doc3");
	        printQueue.add("Doc4");
	        printQueue.add("Doc5");

	        printQueue.poll();
	        printQueue.poll();

	        System.out.println("Remaining docs: " + printQueue);
	}
}
