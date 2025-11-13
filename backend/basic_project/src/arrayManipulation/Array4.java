package arrayManipulation;

import java.lang.reflect.Array;
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
		int[] arr3 = { 1, 2, 3 };

		System.out.println(arr2 + " " + arr3);
//	will compare two array values , if same it returns true or else false
		System.out.println(Arrays.equals(arr2, arr3));
//	will compare two array and finds first mismatch element , if found 
//	it returns its index position or else returns -1
		System.out.println(Arrays.mismatch(arr2, arr3));

		if (Arrays.mismatch(arr2, arr3) == -1) {
			System.out.println("both arrays elements are same");
		} else {
			System.out.println("both arrays elements are not same");
		}

		int[] arr4 = { 10, 23, 34, 12, 54, 34 };// size=6
		System.out.println("original " + Arrays.toString(arr4));
		int[] copy = Arrays.copyOf(arr4, 5);// decreased size by 1
		System.out.println("copied " + Arrays.toString(copy));

		int[] copy1 = Arrays.copyOf(arr4, arr4.length); // same size
		System.out.println("copied " + Arrays.toString(copy1));

		int[] copy2 = Arrays.copyOf(arr4, 7);// increased size by 1
		System.out.println("copied " + Arrays.toString(copy2));

		int[] copy3 = Arrays.copyOfRange(arr4, 2, 4);
		// (from)2 ,(to)4 positions 4 is exceluded , so it retunrs 2 and 3 positions
		System.out.println("copied " + Arrays.toString(copy3));

		int[] arr5 = { 10, 123, 20, 23, 45, 123, 123 };
		int value = 123;
//		boolean res=false;
//		for(int a:arr5) {
//			if(value==a) {
//				res=true;				
//			}
//		}
//		if (res )
//			System.out.println(value + " is exist");
//		else
//			System.out.println(value + " is not exist");

		
		Arrays.sort(arr5);
		int res = Arrays.binarySearch(arr5, value);
		if (res >= 0)
			System.out.println(value + " is exist");
		else
			System.out.println(value + " is not exist");

	}
}
