public class Student {
    static String schoolName = "ST Joseph";

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.schoolName = "RCM School";

        System.out.println(s2.schoolName);
    }
}