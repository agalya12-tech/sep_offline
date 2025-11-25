package wrapper_casting;

public class PrimitiveCasting {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; // implicit
		short shortValue = (short) intValue;// explicit
//		passing data into method
		intMethod(byteValue);// implicit
		shortMethod((short)intValue);// explicit
	}
	public static void intMethod(int a) { //implicit
		System.out.println(a);
	}
	public static void shortMethod(short a) {//explicit
		System.out.println(a);
	}
}
