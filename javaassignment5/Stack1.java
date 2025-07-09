import java.util.Stack;
public class Stack1 {
    public static void main(String args[]){
        Stack<Integer> stack1=new Stack<>();

        stack1.push(5);
        stack1.push(10);
        stack1.push(15);
        stack1.push(20);
        stack1.push(25);

        stack1.pop();
        stack1.pop();

        System.out.println(stack1);
    }
}
