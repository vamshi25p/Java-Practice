import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the indian rupee: ");
        int indian = input.nextInt();
        float usd = indian / 83.65f;
        System.out.println("US Dollar value for given indian rupee: " + usd);
    }
}
