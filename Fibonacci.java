import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the count of numbers you want for fibonacci series: ");
        int p=0;
        int i=1;
        int n=input.nextInt(); 
        int c=2; 
        while(c<=n){
            int temp=i ;
            i=i+p;
            p=temp;
            c++;
        }
        System.out.println(i);

    }
}
