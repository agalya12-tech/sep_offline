package wrapper_casting;

//  String --->primitive data types(other than charctaer)
public class Parsing {

	public static void main(String[] args) {
		String s = "10";
		int i = Integer.parseInt(s);
		System.out.println(i);
		int i2 = Integer.valueOf(s);

		String s2 = "false123"; // It ignores 123
		boolean b = Boolean.parseBoolean(s2);
		System.out.println(b);

		String s3 = "10.0567gf"; // NumberFormatException
		float f = Float.parseFloat(s3);
		System.out.println(f);
		float f2 = Float.valueOf(s3);
		System.out.println(f2);

	}

}
