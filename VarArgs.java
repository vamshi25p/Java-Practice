import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun();
        multiple(2, 3, "vamshi", "kalki");
    }

    static void multiple(int a, int b, String... v) {
        System.out.println("Hello");
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
