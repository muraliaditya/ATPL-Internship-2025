public interface Greeting {
    void sayhello();
}
public class AnonymousClass {
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            public void sayhello() {
                System.out.println("Hello!");
            }
        };
        g.sayhello();
    }
}