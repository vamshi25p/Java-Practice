public interface A {
    static void greeting() {
        System.out.println("Iam a static method");
    }

    default void fun() {
        System.out.println("Iam in A");
    }
}
