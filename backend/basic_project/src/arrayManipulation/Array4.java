package arrayManipulation;

import java.util.Arrays;
import java.util.Collections;

public class Array4 {

	public static void main(String[] args) {
		Integer[] arr = { 2, 5, 1, 6, 7 };
		System.out.println(Arrays.toString(arr));

//		Arrays.sort(arr); default ascending order
//		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr, Collections.reverseOrder());// descending order
		System.out.println(Arrays.toString(arr));

		int[] arr2 = { 1, 2, 3 };
		int[] arr3 = { 1, 2, 5 };

		System.out.println(arr2 + " " + arr3);
//	will compare two array values , if same it returns true or else false
		System.out.println(Arrays.equals(arr2, arr3));
		
		System.out.println(Arrays.mismatch(arr2, arr3));

	}
}
