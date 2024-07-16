import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human vamshi = new Human(21, "Vamshi");
        // Human twin = new Human(vamshi);
        Human twin = (Human) vamshi.clone();
        System.out.println(twin.age);
        System.out.println(twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(vamshi.arr));
        System.out.println(Arrays.toString(twin.arr));
    }
}
