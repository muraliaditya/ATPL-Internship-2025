package a1;

public class Access2 extends Access1{
    public static void main(String[] args) {
        Access1 a1=new Access1();
        System.out.println(a1.publicVar);
        //System.out.println(a1.privateVar);
        System.out.println(a1.defaultVar);
        System.out.println( a1.protectedVar);
    }
}
