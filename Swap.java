public class Swap {
    public static void main(String[] args) {
        int a = 20;
        int b = 60;
        // int temp=a;
        // a=b;
        // b=temp;
        swap(a, b);
        System.out.println(a + " " + b);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
