package methods;

public class MethodProgram2 {
	public static void m1() {
		System.out.println("m1 method");
	}
	public static void m2(int a) {
		System.out.println("m2 method " + a);
	}
	public static void main(String[] args) {
		m1();
		int i = 10;
		m2(i);// int - int
		byte b = 10;
		m2(b);// byte - int --->implicit
		long g = 1009876432l;
		m2((int) g);// long - int--->explicit
	}
}
