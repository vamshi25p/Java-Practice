
import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i);
        }

        // arr.forEach((item) -> {
        // System.out.println(item * 2);
        // });

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);
        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation product = (a, b) -> a * b;

        LambdaFunctions myCalci = new LambdaFunctions();
        System.out.println(myCalci.operate(5, 3, sum));
        System.out.println(myCalci.operate(5, 3, sub));
        System.out.println(myCalci.operate(5, 3, product));

    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}

interface Operation {
    int operation(int a, int b);
}
