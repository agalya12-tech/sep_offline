public class Decimal_Binary {
   public static void main(String[] args) {
        int num=2;
        String binary=""; //10
       
        for(;num>0;){
            int rem=num%2;
             binary=rem+binary;
            num/=2;
        }
        
        System.out.println(binary);
    }   
}
