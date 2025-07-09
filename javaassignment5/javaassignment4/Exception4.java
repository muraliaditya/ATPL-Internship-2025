import java.io.*;

public class Exception4{
    public static void main(String args[])throws FileNotFoundException,IOException{
        try{
        FileReader file=new FileReader("text document");

        System.out.println(file.read());
        }
        catch(FileNotFoundException fe){
            System.out.println(fe.getMessage());
        }
        catch(IOException ie){
            System.err.println(ie.getMessage());
        }

        finally{
            System.out.println("Specify the correct file location");
        }
    }

}