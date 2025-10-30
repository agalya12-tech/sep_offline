import java.util.Arrays;
public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 3, 4, 12, 17, 15, 24 };
        int[] arr2 = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num % 2 == 0) {
                arr2[index] = num;
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num % 2 != 0) {
                arr2[index] = num;
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}
