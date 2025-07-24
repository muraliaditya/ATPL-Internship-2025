import java.util.*;
@FunctionalInterface
interface Square {
    int apply(int x);
}
public class SquareList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Square square = x -> x * x;
        System.out.print("Squared numbers: ");
        numbers.forEach(n -> System.out.print(square.apply(n) + " "));
    }
}