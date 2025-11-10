package basic_project;

import java.util.Arrays;

public class Looping1 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
//		System.out.println(arr);
//		System.out.println(Arrays.toString(arr));
		int n=arr.length;
			 System.out.println("-----while loop-----");	
	     int index=0;
	     while(index<n) {
	    	 System.out.println(arr[index]);
	    	 index++;
	     }
	     System.out.println("-----for loop-----");
	     for(int i=0;i<n;i++) {
	    	 System.out.println(arr[i]);
	     }
	     System.out.println("-----advanced for loop-----");
	     for(int a:arr) {
	    	 System.out.println(a);
	     }
	}
}
