import java.io.*;

public class Exception31 {
    public static void main(String args[])throws IOException{
        try{
        FileReader file=new FileReader("text document");

        System.out.println(file.read());
        }
        catch(IOException ie){
            System.err.println(ie.getMessage());
        }
    }

}
