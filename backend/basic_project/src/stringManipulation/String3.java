package stringManipulation;

import java.util.Arrays;

public class String3 {
	public static void main(String[] args) {

		String s1="Hello";
		String s2="hello";
		
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//trues
		System.out.println(s1.length());//5
		System.out.println(s1.charAt(2));//l
		char []arr=s1.toCharArray();
		System.out.println(Arrays.toString(arr));//[H, e, l, l, o]
		System.out.println(s1.toUpperCase());//HELLO
		System.out.println(s1.toLowerCase());//hello
		s1.
	}
}
