import java.util.Vector;
import java.util.Enumeration;
public class Vector1 {
    public static void main(String[] args) {
        Vector<Double> d=new Vector<>();
        d.addElement(8.4);
        d.addElement(9.62);
        d.addElement(7.51);
        d.addElement(8.82);

        Enumeration<Double> e= d.elements();

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
