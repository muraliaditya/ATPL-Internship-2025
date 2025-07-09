import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception8 {
    public static void main(String[] args)
    {
        scanFile("hey");
    }
    static void scanFile(String fileName) {
        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNextLine())
                System.out.println(sc.nextLine());
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

}
