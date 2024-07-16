public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34);
        ObjectDemo obj2 = obj;
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj2.equals(obj));
        System.out.println(obj instanceof ObjectDemo);
        System.out.println(obj2.getClass().getName());
        
    }
}
