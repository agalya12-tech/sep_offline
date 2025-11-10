package methods;

public class MethodProgram3 {

	public static void m1() {
		System.out.println("m1 method starts");
		m2();	
		System.out.println("m1 method ends");
	}
	public static int m2() {
		return 10;
	}
	public static void main(String[] args) {
		System.out.println("main method starts");
		m1();
		int res=m2();
		System.out.println("main method end");

	}
} 
