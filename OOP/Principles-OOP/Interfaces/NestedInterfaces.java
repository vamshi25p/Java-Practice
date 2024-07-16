public class NestedInterfaces {
    public interface InnerNestedInterfaces {
        boolean isOdd(int num);
    }
}

class Boolea implements NestedInterfaces.InnerNestedInterfaces {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}