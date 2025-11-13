package arrayManipulation;

import java.util.Arrays;
//import java.lang.String;-- compiler will import implicitly
public class Array2 {
	public static void main(String[] args) {
		 int[]arr= {10,20,30,40};
		 System.out.println(arr);//[I@5ca881b5
		 System.out.println(Arrays.toString(arr));
		 
		 System.out.println(arr[0]);//10;
		 arr[0]=100;
		 System.out.println(arr[0]);//100
		 System.out.println(arr[2]);//30
//		 System.out.println(arr[5]);AIOBE
//		 arr[5]=30; size is fixed
//		 System.out.println(arr[5]);
		 
	}
}
