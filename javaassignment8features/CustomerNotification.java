import java.util.*;
import java.util.function.Consumer;
import java.util.stream.*;

class Customer {
    String name;
    boolean subscribed;

    Customer(String name, boolean subscribed) {
        this.name = name;
        this.subscribed = subscribed;
    }
}
public class CustomerNotification {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList( 
            new Customer("Aditya", true),
            new Customer("Rahul", false),
            new Customer("Durga", true),
            new Customer("Daiva", false)
        );
        Consumer<Customer> notifyCustomer = c -> 
            System.out.println("Sending notification to: " + c.name);
        customers.stream()
                 .filter(c -> c.subscribed)
                 .forEach(notifyCustomer);
    }
}

