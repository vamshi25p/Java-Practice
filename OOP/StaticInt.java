public class StaticInt {
    // Initialization of static variables
    static int a = 4;
    static int b;
    // will only run once, when the first obj is created i.e when the class is
    // loaded fot the first time
    static {
        System.out.println("Iam in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a + StaticInt.b);

        StaticInt.b += 3;
        StaticInt obj2 = new StaticInt();
        System.out.println(StaticInt.a + StaticInt.b);
    }

}
