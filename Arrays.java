public class Arrays {
    public static void main(String[] args) {
        //primitives->stack memory 
        //objects->heap memory 
        //array may not be continous in java 
        int[] roll_no=new int[5];
        int[] roll_no2={23,12,34,58,29};
        String[] arr=new String[4]; 
        System.out.println(roll_no[3]); //0
        System.out.println(arr[2]); //null
    }
}
