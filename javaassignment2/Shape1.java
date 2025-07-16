abstract class Shape {
    abstract void area();
}

class Square extends Shape {
    double side;

    Square(double s) {
        this.side = s;
    }

    void area() {
        System.out.println(side*side);
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }

    void area() {
        
        System.out.println(base*height);
        
}
}
class Shape1{
    public static void main(String[] args) {
        Triangle t=new Triangle(3, 4);
        t.area();

        Square s=new Square(3);
        s.area();
    }
}

