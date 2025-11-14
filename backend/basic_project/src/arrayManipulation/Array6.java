package arrayManipulation;

import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		String[][] arr = { 
//				     0       1      2
				   { "ONE", "TWO", "THREE" },//0
				   { "FOUR", "FIVE", "SIX" },//1
				   { "SEVEN", "EIGHT", "NINE" }//2
			};
//		 arr[row][col]
		System.out.println(arr[1][1]);//FIVE
		System.out.println(arr[2][2]);//NINE
		System.out.println(arr[0][2]);//THREE
		arr[2][1]="TEN";
		System.out.println(Arrays.deepToString(arr));
		
	}
}
