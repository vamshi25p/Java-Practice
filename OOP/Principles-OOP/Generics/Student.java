public class Student implements Comparable<Student> {
    int rollno;
    int marks;

    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = this.marks - o.marks;
        return diff;
    }

    @Override
    public String toString() {
        return marks + " " + rollno;
    }
}
