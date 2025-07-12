import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " " + salary;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Joe", 25000));
        employees.add(new Employee("Adi", 32000));
        employees.add(new Employee("Sony", 28000));
        employees.add(new Employee("Kim", 40000));

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().salary < 30000) {
                iterator.remove();
            }
        }

        employees.forEach(System.out::println);
    }
}
