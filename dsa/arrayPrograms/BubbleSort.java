import java.util.Arrays;
class BubbleSort {
    public static void main(String[] args) {
        int []arr={4,3,1,6,7};
        System.out.println("Unsorted array "+Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array "+Arrays.toString(arr));
    }
}