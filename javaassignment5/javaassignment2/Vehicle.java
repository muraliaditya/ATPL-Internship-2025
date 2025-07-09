
class Car extends Vehicle {
    int capacity;
    public void start(int mode,int capacity){
        this.capacity=capacity;
        System.out.println("mode : "+mode+"capacity : "+capacity);
    }    
    public static void main(String args[]){
        Car c=new Car();
        c.start(10,20);
    }
}
public class Vehicle {
    int mode;
    public int start(int mode){
        this.mode=mode;
        return mode;
    }
}
class Bike extends Vehicle{
    int fuel;
    public int start(int fuel){
        this.fuel=fuel;
        System.out.println("mode : "+mode+"fuel : "+fuel);
        return fuel;
    }
}