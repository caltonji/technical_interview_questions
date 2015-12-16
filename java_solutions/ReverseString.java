import java.lang.StringBuilder;

public class ReverseString {
    static String str = "abcdefgh";

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        System.out.println("before: " + str);
        for (int i = str.length() - 1; i >= 0; i--) {
            s.append(str.charAt(i));
        }
        str = s.toString();
        System.out.println("after: " + str);
        str = new StringBuilder(str).reverse().toString();
        System.out.println("oneline: " + str);
    }
}
