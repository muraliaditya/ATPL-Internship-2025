import java.util.*;

public class Exception1 {
    int m=5;
    public static void checkPositive(int m){
        if(m<0){
            throw new IllegalArgumentException("Age should be positive");
        }
        else{
            System.out.println("Age is "+m);
        }
    }

    public static void main(String args[]){
       checkPositive(10);
    }
}
