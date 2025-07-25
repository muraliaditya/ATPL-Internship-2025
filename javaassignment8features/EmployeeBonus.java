import java.util.*;
import java.util.function.*;

class Employee {
    String name;
    double salary;
    String email;

    Employee(String name, double salary, String email) {
        this.name = name;
        this.salary = salary;
        this.email = email;
    }
}

public class EmployeeBonus {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Aditya", 55000, "aditya@gmail.com"),
            new Employee("Dinesh", 51000, "dinesh@gmail.com"),
            new Employee("Gotham", 42000, null),
            new Employee("Pramodh", 51000, null)
        );

        Predicate<Employee> isEligibleForBonus = e -> e.salary > 50000;

        employees.stream().filter(isEligibleForBonus).forEach(e -> {
                     Optional<String> optionalEmail = Optional.ofNullable(e.email);
                     if (optionalEmail.isPresent()) {
                         System.out.println(optionalEmail.get());
                     } else {
                         System.out.println("Email not available");
                     }
                 });
    }
}



