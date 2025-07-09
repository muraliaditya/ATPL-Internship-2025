import java.util.Vector;
import java.util.Enumeration;
public class Vector1 {
    public static void main(String[] args) {
        Vector<Double> Vector11=new Vector<>();
        Vector11.addElement(8.4);
        Vector11.addElement(9.62);
        Vector11.addElement(7.51);
        Vector11.addElement(8.82);

        Enumeration<Double> enum1= Vector11.elements();

        while(enum1.hasMoreElements()){
            System.out.println(enum1.nextElement());
        }

    }
}
