package stringManipulation;

public class String2 {

	public static void main(String[] args) {
		String s="toes";
	    String reverse="";
	    for(int i=0;i<s.length();i++) {
	    	reverse=s.charAt(i)+reverse;
	    }
	    System.out.println(s+" "+reverse);
	}
}
