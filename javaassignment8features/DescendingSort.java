import java.util.*;

public class DescendingSort {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
        Comparator<Integer> descending = (a, b) -> b - a;
        Collections.sort(numbers, descending);
        System.out.print("Sorted in descending order: ");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }
}