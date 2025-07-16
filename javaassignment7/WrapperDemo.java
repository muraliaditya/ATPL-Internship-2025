public class WrapperDemo {
    public static void main(String[] args) {
        Integer intObj = Integer.valueOf(10);
        Double doubleObj = Double.valueOf(15.5);
        Character charObj = Character.valueOf('A');
        Boolean boolObj = Boolean.valueOf(true);

        System.out.println(intObj.getClass().getName());
        System.out.println(doubleObj.getClass().getName());
        System.out.println(charObj.getClass().getName());
        System.out.println(boolObj.getClass().getName());
    }
}
