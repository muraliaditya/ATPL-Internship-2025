public class String2 {
    public static void main(String[] args) {
        String s1 = "HOW";
        String s2 = " ARE";
        String s3 = " YOU";
        String result1 = s1 + s2 + s3;
        System.out.println("Using + : " + result1);
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.append(s2);
        sb.append(s3);
        String result2 = sb.toString();
        System.out.println("Using StringBuilder: " + result2);
        StringBuffer sbf = new StringBuffer();
        sbf.append(s1);
        sbf.append(s2);
        sbf.append(s3);
        String result3 = sbf.toString();
        System.out.println("Using StringBuffer: " + result3);
    }
}

