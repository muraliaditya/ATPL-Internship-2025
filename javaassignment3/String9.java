import java.util.Scanner;

public class String9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string1");
        String str1 = sc.nextLine();
        System.out.print("Enter string2");
        String str2 = sc.nextLine();
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str2));
    }
}
