import java.util.Arrays;

public class StuMain {
    public static void main(String[] args) {
        Student vamshi = new Student(10, 99);
        Student kunal = new Student(11, 100);
        Student rahul = new Student(12, 97);
        Student karan = new Student(14, 92);
        Student list[] = { kunal, rahul, karan, vamshi };
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        if (vamshi.compareTo(kunal) < 0) {
            System.out.println(vamshi.compareTo(kunal));
            System.out.println("kunal has more marks");
        } else if (vamshi.compareTo(kunal) > 0) {
            System.out.println(vamshi.compareTo(kunal));
            System.out.println("kunal has more marks");
        } else {
            System.out.println("Both has equal marks");
        }
    }
}
