
public class A {

    int num; // default access can't allow to access in different packages.
    String name;
    int[] arr;

    public A(int num, String name) {
        super();
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}