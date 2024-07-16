public class countNums {
    public static void main(String[] args) {
        int n=456555; 
        int c=0; 
        while(n>0){
            int rem=n%10; 
            if(rem==5){
                c++;
            }
            n=n/10;
        }
        System.out.println(c);
    }
}
