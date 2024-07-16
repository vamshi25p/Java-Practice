//outside classes cannot be static 

public class InnerClasses {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("vamshi");
        Test b = new Test("Rahul");
        System.out.println(a);
        System.out.println(b);
    }
}
