public class Performance {
    public static void main(String[] args) {
        String series=" "; 
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i); 
            series+=ch;  //Space complexity of N^2 because a lot of wastage of space of no reference variables for a,ab,abc,......,abcdefg....xy : 1+2+3+4+.....N-1=o(N^2) 
            
        }
        System.out.println(series);
    }
}
