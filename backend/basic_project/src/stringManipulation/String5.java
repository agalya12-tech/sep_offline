package stringManipulation;

public class String5 {

	public static void main(String[] args) {
		String s = "listen";
		String s1 = "silent";
		if (isAnagram(s1, s)) {
			System.out.println("is an anagram");
		}
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
