import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = i.nextFloat();
        // float num = i.nextFloat();
        // System.out.println((int) (num));

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;

        // int d = a * b / c;
        // System.out.println(d);
        // byte b=50;
        // b =b *2;

        // int n='a';
        // System.out.println(n);

        // char k=97;
        // System.out.println(k);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;

        double result = (f * b) + (i / c) - (d * s);
        // float + int - double=double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}
