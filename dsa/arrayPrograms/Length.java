public class Length {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 1, 6, 7 };
        System.out.println("Length of the array is: " + arr.length);
        int size=0;
        for(int i:arr){
            size++;
        }
        System.out.println("Length of the array using loop is: " + size);
         int index=0;
        try{
            while(true){
                int temp=arr[index];
                index++;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Length of the array using exception is: " + index);
        }



    }
}
