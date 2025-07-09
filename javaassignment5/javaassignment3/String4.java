public class String4 {
    public static void main(String[] args) {
        String str= "Learning Java is fun and interesting";
        String[] arr = str.split(" ");
        System.out.println("Number of words: " + arr.length);
        int firstIndex = str.indexOf('i');
        int lastIndex = str.lastIndexOf('i');
        System.out.println("First index of 'i': " + firstIndex);
        System.out.println("Last index of 'i': " + lastIndex);
        boolean startsWithLearn = str.startsWith("Learn");
        boolean endsWithIng = str.endsWith("ing");
        System.out.println("Starts with Learn " + startsWithLearn);
        System.out.println("Ends with ing " + endsWithIng);
    }
}

