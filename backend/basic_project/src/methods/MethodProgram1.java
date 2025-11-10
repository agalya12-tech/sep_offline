package methods;

public class MethodProgram1 {

	public static void m1() {
		System.out.println("m1 method");
//		return;
	}

	public static int m2() {
		return 10;
	}

	public static void main(String[] args) {
		m1(); // calling statement
		m1(); // method signature
		m1(); // method caller or method invoker
		int res = m2();
//		System.out.println(m1());
		System.out.println(m2());
		return;
	}
}
