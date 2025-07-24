import java.util.*;
@FunctionalInterface
interface EvenChecker {
    boolean isEven(int n);
}
public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
        EvenChecker checker = n -> n % 2 == 0;
        for (Integer num : numbers) {
            if (checker.isEven(num)) {
                System.out.print(num + " ");
            }
        }
    }
}