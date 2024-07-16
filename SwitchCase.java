import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String fruit = in.next();
        // switch (fruit) {

        // case "Mango":
        // System.out.println("King of fruits");
        // break;
        // case "Apple":
        // System.out.println("A sweet red fruit");
        // break;
        // case "Orange":
        // System.out.println("Round fruit");
        // break;
        // case "Grapes":
        // System.out.println("Small fruit");
        // break;
        // default:
        // System.out.println("Please enter a valid fruit");
        // break;

        // }

        int day = in.nextInt();
        switch (day) {
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                System.out.println("Weekday");
                break;
            case 6:

            case 7:
                System.out.println("Weekend");
                break;
        }

    }
}
