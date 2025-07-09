import java.util.Scanner;
public class String6 {
     public static String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String originalPassword = sc.nextLine();
        String encryptedPassword = encryptPassword(originalPassword);

        System.out.println("Encrypted : " + encryptedPassword);
        System.out.println("Original : " + originalPassword);
    }
   
}
