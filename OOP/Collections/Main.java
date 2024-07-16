import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println(list2);

        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(45);
        vector.add(45);
        vector.add(45);
        System.out.println(vector);
        Week week;
        week = Week.Monday;
        week.hello();

        // for (Week day : Week.values()) {
        // System.out.println(day);
        // }

    }

    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        Week() {
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("hey how are you");
        }
    }
}