package basic_project;

public class VariableProgram3 {
	final static int value=10;
	public static void main(String[] args) {
	     value=20;
		System.out.println(value);
		final int value2=20;
		 value2=30;
		System.out.println(value2);
	}
}
