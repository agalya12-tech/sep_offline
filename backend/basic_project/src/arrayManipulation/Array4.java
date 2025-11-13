package arrayManipulation;

import java.util.Arrays;
import java.util.Collections;

public class Array4 {

	public static void main(String[] args) {
		Integer []arr= {2,5,1,6,7};
		System.out.println(Arrays.toString(arr));
		
//		Arrays.sort(arr); default ascending order
//		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr,Collections.reverseOrder());// descending order
		System.out.println(Arrays.toString(arr));

	}
}
