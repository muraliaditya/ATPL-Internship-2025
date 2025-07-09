abstract class Shape {
    void draw(){

    }   
}
public class Anonclass2 {
    public static void main(String[] args) {
            Shape s=new Shape(){
            void draw(){
                System.out.println("drawing");
            }
        };
        s.draw();
    }
}
