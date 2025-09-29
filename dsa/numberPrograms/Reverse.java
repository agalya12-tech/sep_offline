public class Reverse {
    public static void main(String[] args) {
        int num=121;
        int temp=num;
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println(rev);
        if(temp==rev){
            System.out.println(temp+" is a palindrome number");
        }
    }
}
