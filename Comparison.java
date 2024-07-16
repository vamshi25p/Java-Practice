import java.util.Arrays;

public class Comparison {
    public static void main(String[] args) {
        String a=new String("Vamshi"); 
        String b=new String("Vamshi"); 

        System.out.println(a==b); //In the above case java is creating two objects, so it returns false 
        System.out.println(a.equals(b)); //returns true

        String name1="Vamshi"; 
        String name2="Vamshi"; 
        System.out.println(name1==name2); //returns true because same object in string pool  
        System.out.println(a.charAt(0)); 
        System.out.println(Arrays.toString(new int[]{1,2,3,4,5,6,7,8,9})); 
        System.out.println(56);
         
        
    }
}
