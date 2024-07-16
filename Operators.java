import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');  //195 
        System.out.println("a"+"b"); //ab
        System.out.println((char)('a'+3)); //d

        System.out.println("a" + 1); //a1 
        // integer will be converted to Integer that will call toString()  

        System.out.println("Vamshi" + new ArrayList<>()); //Vamshi[]  
        // System.out.println(new Integer(0)+new ArrayList<>()); ***This will not work because plus operator works only for primitives and with included of string only.
        
    }
}
