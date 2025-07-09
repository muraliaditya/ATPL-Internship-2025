class Circle {
    private double radius;

    public void setradius(double r) {
        this.radius = r;
        System.out.println(radius);
    }

    public void getarea() {
        System.out.println(Math.PI *( radius * radius));
    }

    public void getcircumference() {
        System.out.println(2* Math.PI * radius);
    }

}
public class Circle1 {

     public static void main(String[] args) {
        Circle c=new Circle();
        c.setradius(4);
        c.getarea();
        c.getcircumference();
     }
}