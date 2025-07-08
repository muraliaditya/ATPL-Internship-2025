class MathUtils {
    int calculate(int a, int b) {
        return a + b;
    }

    double calculate(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        MathUtils mu = new MathUtils();
        System.out.println(mu.calculate(5, 5));
        System.out.println(mu.calculate(5.0, 5.0));
    }
}
