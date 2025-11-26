package wrapper_casting;

// non primitive - primitive --->UnBoxing
public class Unboxing {
	public static void main(String[] args) {
		Integer i = 10;
		int intValue = i;
//         or 
		int intValue2 = i.intValue();

		Character c = 'a';
		char charValue = c;
//       or
		char charValue2 = c.charValue();
	}
}
