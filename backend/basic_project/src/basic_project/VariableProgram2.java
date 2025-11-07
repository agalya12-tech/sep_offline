package basic_project;

public class VariableProgram2 {
	// global variable
	static int num1; // static variable
	String value1; // non static varaible

	static byte byteValue;
	public static void main(String[] args) {
		int num2; // local variable
//      System.out.println(num2); CTE 
//		R- local varibale can't use without assigining value
		System.out.println(num1); // 0 -default value
//		Global members can use without assigining value - it gives default
		
		
		byte byteValue;
//		byte byteValue;  in same scope , we can't have duplicate names
//		System.out.println(byteValue);CTE 
//		it is giving priority to local member
		
		VariableProgram2 program2=new VariableProgram2();
		System.out.println(program2.value1);
		
	}
}
