public class Factor {
    public static void main(String[] args) {
        for (int num = 1; num <= 10; num++) {
            System.out.println("\n------" + num + "------");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
