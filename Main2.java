public class Main2{
    public static void main(String[] args) {
        int sal=10000; 
        if(sal>1000){
            sal+=2000;

        } 
        else if(sal==10000){
            sal+=20000;
        }
        else{
            sal+=1000;
        }
        System.out.println(sal);

    }
}