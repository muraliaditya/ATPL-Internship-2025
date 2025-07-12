import java.io.*;

public class FileConcatenator {
    public static void main(String[] args) {
        try (
            BufferedReader reader1 = new BufferedReader(new FileReader("file1.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("file2.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("concatenated.txt"))
        ) {
            String line;
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

        } catch (FileNotFoundException e) {
            System.err.println("input files was not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("error occurred: " + e.getMessage());
        }
    }
}

