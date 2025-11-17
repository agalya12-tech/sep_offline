package stringManipulation;

import java.util.Arrays;

public class String5 {

	public static void main(String[] args) {
		String s = "listten";
		String s1 = "silentt";
		if (isAnagram1(s1, s)) {
			System.out.println("is an anagram");
		}
	}

	public static boolean isAnagram1(String s1,String s2) {
		char [] ch1=s1.toCharArray();
		char[]ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
	}
	
	
	public static boolean isAnagram(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		} else {
			for (char c : s1.toCharArray()) {
//				if (s2.indexOf(c) != -1) {
				if (s2.contains(c + "")) {
					return true;
				} else {
					return false;
				}

			}
		}

		return false;
	}
}
