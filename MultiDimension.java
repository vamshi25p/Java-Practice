import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        // int[][] arr=new int[3][]; //adding no. of rows is mandatory
        // int[][] arr2D = {
        // { 1, 2, 3 }, //0th index
        // { 4, 5 }, //1st index
        // { 7, 8, 9, 10 }, //2nd index
        // };

        int[][] arr = new int[3][3]; // length of arr is no. of rows
        Scanner in = new Scanner(System.in);
        // input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        // for (int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // for(int row=0;row<arr.length;row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
