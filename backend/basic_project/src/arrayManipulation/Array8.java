package arrayManipulation;

import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		int[][] arr1 = { { 10, 20, 30 }, 
				         { 40, 50, 60 }, 
				         { 70, 80 ,90} };
		
		int[][] arr2 = { { 100, 200, 300 },
				         { 400, 500, 600 }, 
				         { 700, 800 ,900} };
		
		int[][]output= new int[3][3];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
			output[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println(Arrays.deepToString(arr1));
		System.out.println(Arrays.deepToString(arr2));
		System.out.println(Arrays.deepToString(output));

	}
}
