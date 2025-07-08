import java.util.Scanner;
class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        System.out.println("String loop: " + reversed);
        StringBuilder sb = new StringBuilder(s);
        System.out.println("StringBuilder: " + sb.reverse());
        StringBuffer sbf = new StringBuffer(s);
        System.out.println("StringBuffer: " + sbf.reverse());
    }
}

