// package javaassignment8;
import java.text.MessageFormat;

public class StudentSummary {
    public static void main(String[] args) {
        String name = "Priya";
        String dept = "ECE";
        double gpa = 9.12;

        String summary = MessageFormat.format(
            "Student {0} from {1} department has secured a GPA of {2}.",
            name, dept, gpa
        );
        System.out.println(summary);
    }
}