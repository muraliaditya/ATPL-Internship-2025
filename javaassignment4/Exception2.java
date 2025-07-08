import java.io.*;

public class Exception2 {
    static void readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null)
            System.out.println(line);
        br.close();
    }

    public static void main(String[] args) {
        try {
            readFile("file.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}