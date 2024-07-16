
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] rolls = new int[5];
        String[] names = new String[5];
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        Student Vamshi;
        Vamshi = new Student(58, "Vamshi Krishna", 96.7f);
        // Vamshi.rno = 30;
        // Vamshi.name = "Vamshi Krishna";
        // Vamshi.marks = 96.7f;

        System.out.println(Vamshi.marks);
        System.out.println(Vamshi.name);
        System.out.println(Vamshi.rno);
        // Vamshi.changeName("Prabhas");
        // Vamshi.greeting();

        Student random = new Student(Vamshi);
        System.out.println(random.name);
        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Sai";
        System.out.println(two.name);

    }

}

// create a class
class Student {
    int rno;
    String name;
    float marks;

    // we need a way to add the values of the above properties object by object
    // we need one word to access every object

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String newName) {
        name = newName;
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student() {
        this(13, "default", 100.00f);
    }

    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
}