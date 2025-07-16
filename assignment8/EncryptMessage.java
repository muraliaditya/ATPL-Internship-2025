import java.io.*;
import java.util.Scanner;

public class EncryptMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter message to encrypt: ");
        String message = scanner.nextLine();

        StringBuilder encrypted = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                encrypted.append((char)((c - base + 3) % 26 + base));
            } else {
                encrypted.append(c);
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("encrypted.txt"))) {
            writer.write(encrypted.toString());
            System.out.println("Encrypted message written to encrypted.txt");
        } catch (IOException e) {
            System.err.println("Error " + e.getMessage());
        }
    }
}

