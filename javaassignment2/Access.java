public class Access {
    public int publicVar = 1;
    private int privateVar = 2;
    int defaultVar = 3;
    protected int protectedVar = 4;

    public void accessWithinClass() {
        System.out.println(publicVar);
        System.out.println(privateVar);
        System.out.println(defaultVar);
        System.out.println( protectedVar);
    }
    public static void main(String[] args) {
        Access a=new Access();
        a.accessWithinClass();
    }
}