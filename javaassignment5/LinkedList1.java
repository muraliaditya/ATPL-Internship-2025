import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> li = new LinkedList<Integer>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        li.add(50);

        li.add(0,5);
        li.add(li.size(),60);

        li.remove(2);

        System.out.println(li);

    }
}