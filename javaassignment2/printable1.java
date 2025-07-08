interface Printable {
    void print();
}

class Document implements Printable {
    public void print() 
    { 
        System.out.println("Printing document");
    }
}
class image implements Printable {
    public void print() 
    { 
        System.out.println("Printing image");
    }
}
class invoice implements Printable {
    public void print() 
    { 
        System.out.println("Printing invoice");
    }
}
public class printable1 {
    public static void main(String[] args) {
        Document d=new Document();
        d.print();
        image i=new image();
        i.print();
        invoice ii=new invoice();
        ii.print();
    }
}
