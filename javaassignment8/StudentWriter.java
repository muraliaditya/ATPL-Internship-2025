import java.io.PrintWriter;
import java.util.Scanner;

public class StudentWriter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (PrintWriter writer = new PrintWriter("students.txt")) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter details for Student " + i);
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Age: ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.print("Department: ");
                String department = sc.nextLine();
                System.out.print("GPA: ");
                double gpa = Double.parseDouble(sc.nextLine());

                writer.printf("Student[name=%s, age=%d, department=%s, gpa=%.2f]%n", name, age, department, gpa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
