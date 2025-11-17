public class Anagram {
    
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
				if (s2.indexOf(c) != -1) {
				// if (s2.contains(c + "")) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}
}

// An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
// For example, the word "listen" can be rearranged to form the word "silent".
