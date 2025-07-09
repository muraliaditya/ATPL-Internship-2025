import java.io.*;

public class Exception7 {
    public static void main(String args[]){
            readFileSafely("hello1.txt");
        }
    static void readFileSafely(String fileName) {
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
