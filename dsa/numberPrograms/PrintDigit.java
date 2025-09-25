public class PrintDigit {
     public static void main(String[] args) {
         int num=1234;
         int sum=0;
         int product=1;
         while(num>0){
             int rem=num%10;
             System.out.println(rem);
             sum+=rem;
             product*=rem;
             num/=10;
         }
         System.out.println("sum of digits "+sum);
        System.out.println("product of digits "+product);
     }
}
