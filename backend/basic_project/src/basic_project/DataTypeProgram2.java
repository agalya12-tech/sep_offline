package basic_project;
/*
 *Primitive TypeCasting: converting one data type into
 * another data type
 */
public class DataTypeProgram2 {
	public static void main(String[] args) {
//		 larger-smaller  -- explicit typeCasting/Narrowing
		 int i=129;
		 byte b=(byte)i;
		 System.out.println(b);
//		 -128 -127 ----- 126 127
//		  smaller -larger -- implicit typeCasting/AutoCasting/Widening
		 byte b1=10;
		 short s=b1;
		 System.out.println(s);
		 
		 char c=97; //converting ASCII into char
		 System.out.println(c);
		 
		 
		 int a='a';//converting char into ASCII
		 System.out.println(a);
	}
}
