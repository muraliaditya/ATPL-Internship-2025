import java.io.*;

public class ReverseLines {
    public static void main(String[] args) {
        try (
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("reversed.txt"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(new StringBuilder(line).reverse().toString());
                writer.newLine();
            }

        } catch (IOException e) {
            System.err.println("File I/O error: " + e.getMessage());
        }
    }
}

