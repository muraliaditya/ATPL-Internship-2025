class super1 {
    void sound()
    {
        System.out.println("super1");
    }
}
class super3 extends super1 {
    void sound() {
        System.out.println("super3");
        super.sound();
    }
}
public class Super2{
    public static void main(String[] args) {
        super3 s = new super3();
        s.sound();
    }
}