<<<<<<< HEAD
import java.util.*;

public class ProductDemo {
    public static void main(String[] args) {
        Map<String, Integer> products = new HashMap<>();
        products.put("Laptop", 50000);
        products.put("Phone", 30000);
        products.put("Tablet", 20000);

        Iterator<Map.Entry<String, Integer>> it = products.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
=======
import java.util.*;

public class ProductDemo {
    public static void main(String[] args) {
        Map<String, Integer> products = new HashMap<>();
        products.put("Laptop", 50000);
        products.put("Phone", 30000);
        products.put("Tablet", 20000);

        Iterator<Map.Entry<String, Integer>> it = products.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
>>>>>>> 2567e8ead3916f0fa3fb15a83648243d6e2a12ce
}