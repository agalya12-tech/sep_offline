public class Harshad {
    public static void main(String[] args) {
        for (int temp = 1; temp <= 50; temp++) {
            int num = temp;
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }
            if (temp % sum == 0)
                System.out.println(temp + " is a harshad number");
        }
    }
}

/**
 * 
 * 18 - 1+8=9
 * 
 * 18/9--->0
 */