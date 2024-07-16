import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the operator: ");
        char op = input.next().charAt(0);
        System.out.println("Enter the first operand: ");
        int n1 = input.nextInt();
        System.out.println("Enter the second operand: ");
        int n2 = input.nextInt();
        int result=0;
        if (op == '+') {
            result = n1 + n2;
        } else if (op == '-') {
            result = n1 - n2;
        } else if (op == '*') {
            result = n1 * n2;
        } else if (op == '/') {
            result = n1 / n2;
        }
        System.out.println("Result: " + result);

    }
}
