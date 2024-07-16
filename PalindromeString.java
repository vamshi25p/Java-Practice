import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String example = in.next();
        System.out.println(isPalindrome(example));

    }

    static boolean isPalindrome(String str) {
        if (str.length() == 0 || str == null) {
            return true;
        }
        str = str.toLowerCase();

        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
