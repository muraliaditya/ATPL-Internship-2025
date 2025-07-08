import java.util.Stack;
public class Stack1 {
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();

        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        s.push(25);

        s.pop();
        s.pop();

        System.out.println(s);
    }
}
