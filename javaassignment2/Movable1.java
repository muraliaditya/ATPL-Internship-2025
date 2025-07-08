interface Movable {
    void move();
}

class Car implements Movable {
    public void move()
    {
         System.out.println("Car moves");
    }
}
class Robot implements Movable{
    public void move()
    {
         System.out.println("Robot moves");
    }
}
class Drone implements Movable{
    public void move()
    {
         System.out.println("Drone moves");
    }
}
public class Movable1 {
    public static void main(String[] args) {
        Car c=new Car();
        c.move();
        Robot r=new Robot();
        r.move();
        Drone d=new Drone();
        d.move();
    }
    
}
