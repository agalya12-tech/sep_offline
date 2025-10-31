import java.util.Arrays;

class ArrayRotation {
    public static void main(String[] args) { //left to right
        int[] arr = { 10, 20, 30, 40 };  
        System.out.println(Arrays.toString(arr));
        int rotation = 2;
        for (int j = 1; j <= rotation; j++) {
            int first = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = first;
            System.out.println(Arrays.toString(arr) + " - " + j + " rotation");
        }
    }
}