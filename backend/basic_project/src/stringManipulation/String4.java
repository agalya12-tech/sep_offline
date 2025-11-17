package stringManipulation;

public class String4 {

	public static void main(String[] args) {
		String s = "Hello World";
		iterate1(s);
		iterate2(s);
		
		
		
		
		String sentence="This is a large sentence which explains about string";
		String[]words=sentence.split(" ");
		iterate3(words);
	}
	
	public static void iterate3(String[]words) {
		for(String word:words) {
			System.out.println(word);
		}
	}
	

	public static void iterate1(String s) {
		System.out.println("--------for loop-----");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " , ");
		}
		System.out.println();
	}
	public static void iterate2(String s) {
		System.out.println("----enhanced for loop-------");
		for(char c:s.toCharArray()) {
			System.out.print(c+" , ");
		}
		System.out.println();
	}
}
