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
		
//		for printing multidimensional array in single line
		System.out.println(Arrays.deepToString(arr));
//		for printing array present in multidimensional array based on index position
		for(int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i])+" "+i +" position");
		}
//	for printing each value in MDA 
		System.out.println("=====Accessing Values=========");
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.println(arr[row][col]);
			}
			System.out.println("-------------");
		}
		
	}
}
