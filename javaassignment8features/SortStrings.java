import java.util.*;

@FunctionalInterface
interface Printer<T> {
    void print(List<T> list);
}

public class SortStrings {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("Banana", "Apple", "Mango", "Cherry"));
        Printer<String> printList = list -> {
            for (String s : list) {
                System.out.print(s + " ");
            }
            System.out.println();
        };
        Collections.sort(fruits, (s1, s2) -> s1.compareTo(s2));
        System.out.print("Alphabetical order: ");
        printList.print(fruits);
        Collections.sort(fruits, (s1, s2) -> s2.compareTo(s1));
        System.out.print("Reverse order: ");
        printList.print(fruits);
    }
}