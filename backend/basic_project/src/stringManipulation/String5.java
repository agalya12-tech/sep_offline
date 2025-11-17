package stringManipulation;

public class String5 {

	public static void main(String[] args) {
		String s = "This is A large sentence which explains about string";
		for (String word : s.split(" ")) {
			char ch = word.charAt(0);

//         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
//			ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
//        	  for vowel
//         }
			String vowel = "aeiouAEIOU";
			int compare = vowel.indexOf(ch);
			if (compare == -1) {
				System.out.println(word + " - " + ch + "  is a consonant");
			} else {
				System.out.println(word + " - " + ch + "  is a vowel");

			}
		}
	}
}
