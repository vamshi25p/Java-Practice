import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in=new Scanner(System.in);
        
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        System.out.println(list.get(0)); //not list[0]
        System.out.println(list);
    }
}
