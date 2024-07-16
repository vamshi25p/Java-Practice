import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        System.out.println("Enter the principal amount: ");
        int principal=input.nextInt();
        System.out.println("Enter the duration: ");
        int time=input.nextInt();
        System.out.println("Enter the rate of interest: ");
        int rate=input.nextInt();
        float result=(principal*time*rate)/100; 
        System.out.println("Simple Interest: "+result);
    }
}
