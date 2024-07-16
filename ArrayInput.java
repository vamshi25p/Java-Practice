import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        // arr[0] = 23;
        // arr[1] = 45;
        // arr[2] = 145;
        // arr[3] = 245;
        // arr[4] = 360;

        // System.out.println(arr[2]);

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = in.nextInt();
        // }

        // System.out.println(Arrays.toString(arr));

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        // for (int num : arr) {
        // System.out.print(num + " ");
        // }

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        str[1]="Vamshi";
        System.out.println(Arrays.toString(str));
    }
}
