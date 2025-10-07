public class Binary_Decimal {
     public static void main(String[] args) {
        int num=123;
        int decimal=0; //5
        
        for(int i=0;num>0;i++){
            int rem=num%10;
           decimal+=rem*Math.pow(2,i);
            num/=10;
        }
        
        System.out.println(decimal);
        
    }
}
