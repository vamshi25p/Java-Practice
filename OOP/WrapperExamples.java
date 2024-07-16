public class WrapperExamples {
    public static void main(String[] args) {
        // int a=10;
        // int b=20;
        // Integer num1 = 45;
        // Integer num2 = 50;
        // swap(num1, num2);
        // System.out.println(num1);
        // System.out.println(num2);

        // final int bonus=2;
        // bonus=3; //final cannot be modified if it is primitive datatype

        final A vamshi = new A("Vamshi");
        vamshi.name = "other name";

        // //when a non primitive is final, you cannot reassign it
        // vamshi=new A("new object");

        A obj=new A("Vamshi");
        System.out.println(obj);
        // for(int i=0;i<100000000;i++){
        // obj=new A("Random name");
        // } //for checking Garbage Collection, when we create thousands of thousands of
        // same objects it deletes the objects because of overload in heap memory.  

    }

    static void swap(Integer a, Integer b) { // doesnt swaps //final is the reason this Integer class doesnt helps to
                                             // swap
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}