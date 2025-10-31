import java.util.Arrays;

public class ArrayRotation2 {
    public static void main(String[] args) { //right to left
        int[] arr = { 10, 20, 30, 40 };  
        //     40 10 20 30
        System.out.println(Arrays.toString(arr));
        int rotation = 2;
        for (int j = 1; j <= rotation; j++) {
            int last = arr[arr.length-1];
            for (int i = arr.length-2; i >=0; i--) {
                 arr[i+1]=arr[i];
            }
            arr[0] = last;
            System.out.println(Arrays.toString(arr) + " - " + j + " rotation");
        }
    }
}
