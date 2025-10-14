public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = { 110, 210, 310, 40, 240 };
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && second != largest) {
                second = arr[i];
            }
        }
        System.out.println(largest + " " + second);


       int smallest = Integer.MAX_VALUE;
       int secondSmallest = Integer.MAX_VALUE;
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] < smallest) {
               secondSmallest = smallest;
               smallest = arr[i];
           } else if (arr[i] < secondSmallest && secondSmallest != smallest) {
               secondSmallest = arr[i];
           }
       }
       System.out.println(smallest + " " + secondSmallest);

    }


}
