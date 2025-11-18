package stringManipulation;

import java.util.StringTokenizer;

public class String6 {
public static void main(String[] args) {
	String sentence="Hello World";
    
	StringTokenizer tokenizer=new StringTokenizer(sentence);
    System.out.println(tokenizer);
    while (tokenizer.hasMoreElements()) {
		Object object = (Object) tokenizer.nextElement();
		System.out.println(object);
    	System.out.println("-------");
	}
    
}
}
