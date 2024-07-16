import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name="Vamshi Krishna Hello World"; 
        System.out.println(java.util.Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase()); 
        System.out.println(name.indexOf('a'));
        System.out.println("        Vamshi      ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
