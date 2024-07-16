public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            // divide(a, b);
            String name = "Vamshi";
            if (name.equals("Vamshi")) {
                throw new MyException("name is Vamshi");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("normal exception");
        } finally {
            System.out.println("This will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Please dont divide by zero");
        }
        return a / b;
    }
}