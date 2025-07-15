package String;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "saini";
        String str2 = "nikhil";

        System.out.println(str1.length());
        System.out.println(str1.charAt(2));
        System.out.println(str2.toLowerCase());
        System.out.println(str2.substring(0,4));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.equals(str2));
        System.out.println(str1.contains("s"));
        System.out.println(str2.indexOf("i"));
    }
    
}
