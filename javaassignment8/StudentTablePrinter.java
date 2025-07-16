// package javaassignment8;
import java.io.PrintWriter;
import java.util.Scanner;
public class StudentTablePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("%-10s %-5s %-12s %-5s%n", "Name", "Age", "Dept", "GPA");

        try (PrintWriter writer = new PrintWriter("students.txt")) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter details of Student " + i);
                System.out.print("Name : ");
                String name = sc.nextLine();
                System.out.print("Age : ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.print("Dept : ");
                String dept = sc.nextLine();
                System.out.print("GPA : ");
                double gpa = Double.parseDouble(sc.nextLine());

                System.out.printf("%-10s %-5d %-12s %-5.2f%n", name, age, dept, gpa);
                writer.printf("Student[name=%s, age=%d, dept=%s, gpa=%.2f]%n", name, age, dept, gpa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
