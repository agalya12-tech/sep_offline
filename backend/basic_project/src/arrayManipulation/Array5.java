package arrayManipulation;

import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
//		1D array
		String [] arr= {"Apple","Banana","ORange"}; 
		System.out.println(Arrays.toString(arr));
//		Multideminsional Array / 2D Array
//		Jagged Array
		String [] [] arr2= {
				           {"Apple","Banana","Orange"},
				           {"Pink","Blue","Red"}
				           };
//		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.deepToString(arr2));
//		Sqaure Matrix
		String [] [] arr3= {
		           {"Apple","Banana","Orange"},
		           {"Pink","Blue","Red"},
		           {"Sunday","Monday","Tuesday"}
		           };
	}
}
