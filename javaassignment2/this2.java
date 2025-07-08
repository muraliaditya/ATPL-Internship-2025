class Student {
    String name;
    int age;

    Student() {
        this("na", 0);
        System.out.println("constructor1");
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("constructor2");
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class this2 {
    public static void main(String[] args) {
        Student s1 = new Student(); 
        Student s2 = new Student("Ravi", 22);
        s1.display();
        s2.display();
    }
}
