import java.util.*;
@FunctionalInterface
interface NameFilter {
    boolean startsWithA(String name);
}
public class FilterNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "Tom", "Angela", "Steve");
        NameFilter filter = name -> name.startsWith("A");
        System.out.print("Names starting with 'A':   ");
        names.forEach(name -> {
            if (filter.startsWithA(name)) {
                System.out.print(name + " "+",");
            }
        });
    }
}