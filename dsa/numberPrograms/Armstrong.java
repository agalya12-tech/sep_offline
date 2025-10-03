public class Armstrong {
    public static void main(String[] args) {
        int num = 123;
        int temp = num;
        int temp2 = num;
        int power = 0;
        int sum = 0;
        while (temp > 0) {
            power++;
            temp /= 10;
        }

        while (temp2 > 0) {
            int rem = temp2 % 10;
            sum += Math.pow(rem, power);
            temp2 /= 10;
        }
        if (num == sum)
            System.out.println(num + " is an armstrong number");
        else
            System.out.println(num + " is not  an armstrong number");

    }

}
/**
 * Armstrong Number: The sum of the power(count of digits) of each
 * digit in a number is equal to the number itself.
 * 153 --- 1*1*1 -1
 * 5*5*5 -125
 * 3*3*3 -27
 * ---------------------
 * 153
 * 
 * 
 * 
 */
