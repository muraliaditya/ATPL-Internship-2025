import java.util.*;
public class String10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("Enter names:");
        for (int i = 0; i < 5; i++) {
            names[i] = sc.nextLine();
        }
        Arrays.sort(names);
        System.out.println("Ascending Order:");
        for (String name : names) {
            System.out.println(name);
        }
        Arrays.sort(names, Collections.reverseOrder());
        System.out.println("Descending Order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

