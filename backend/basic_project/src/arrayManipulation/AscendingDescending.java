package arrayManipulation;

import java.util.Arrays;
import java.util.Collections;

public class AscendingDescending {
	public static void main(String[] args) {
     Integer[]arr= {10,21,11,5,9,23,45,9,2,1,89};
//              5,9,10,11,21
//                          45,23,9,2,1
//              5,9,10,11,23,45,23,9,2,1
     int half=arr.length/2;
     Integer[]firstHalf=Arrays.copyOf(arr, half);
     Arrays.sort(firstHalf);
     
     Integer[] secondHalf=Arrays.copyOfRange(arr, half, arr.length);
     Arrays.sort(secondHalf,Collections.reverseOrder());
     
     
     int[]modifiedArray=new int[arr.length];
     for(int i=0;i<half;i++) {
    	 modifiedArray[i]=firstHalf[i];
     }
     
     for(int i=half;i<arr.length;i++) {
    	 modifiedArray[i]=secondHalf[i-half];
     }
     System.out.println(Arrays.toString(arr)+" original array");
     System.out.println(Arrays.toString(modifiedArray)+" modified array");
	}
}
