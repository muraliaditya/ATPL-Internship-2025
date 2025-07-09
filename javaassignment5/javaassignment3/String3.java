public class String3 {
    public static void main(String[] args) {
        String str = " Java Programming ";
        System.out.println("input: '" + str + "'");
        System.out.println("Trim: '" + str.trim() + "'");
        System.out.println("Lower: " + str.toLowerCase());
        System.out.println("Upper: " + str.toUpperCase());
        System.out.println("Replaced'-': " + str.replace(" ", "-"));
        System.out.println("Substring : " + str.substring(0, 5));
        System.out.println("Index: " + str.indexOf('a'));
    }
}
