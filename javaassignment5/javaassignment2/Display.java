public class Display {
    public void show(int num) {
        System.out.println(num);
    }

    public void show(String str) {
        System.out.println(str);
    }

    public void show(int[] array) {
        for (int n : array)
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Display d = new Display();
        d.show(3);
        d.show("Hello");
        d.show(new int[]{1, 2, 3, 4, 5});
    }
}
