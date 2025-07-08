package a2;
import a1.*;
public class Accesss3 extends Access1{
    public static void main(String[] args) {
        Accesss3 a3=new Accesss3();
        System.out.println(a3.publicVar);
        //System.out.println(a3.privateVar);
        //System.out.println(a3.defaultVar);
        System.out.println( a3.protectedVar);
    }
}
