public class MaxArr {
    public static void main(String[] args) {
        int[] arr={99,0,1,2,3,4,5}; 
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int max=arr[0];
        for(int num:arr){
            if(max<num){
                max=num;
            }
        }
        return max;
    }
}
