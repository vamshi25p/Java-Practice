public class SingleTon {
    private SingleTon() {

    }

    private static SingleTon instance;

    public static SingleTon getInstance() {
        // check whether 1 obj is created or not
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }
}
