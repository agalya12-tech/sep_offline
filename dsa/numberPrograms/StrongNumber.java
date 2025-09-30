public class StrongNumber {
    public static void main(String[] args) {
        for(int num=1;num<=1000;num++){
            int temp=num;
            int sum=0;
            while(temp>0){
                int rem=temp%10;
                int fact=1;
                for(int i=1;i<=rem;i++){
                    fact*=i;
                }
                sum+=fact;
                temp/=10;
            }
            if(sum==num){
                System.out.println(num+" is a strong number");
            }
        }
    }
}

/*
 * Strong Number : the sum of factorial of each digit in a number
 * is equal to the number itself.
 * 123 -not a strong number
 * 1!-1
 * 2!-2
 * 3!-6
 * -------
 * 9
 * 145 - strong number
 * 1!-1
 * 4!-24
 * 5!-120
 * -------
 * 145
 * 
 * 
 */