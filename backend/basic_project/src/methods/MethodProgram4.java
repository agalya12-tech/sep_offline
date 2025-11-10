package methods;

public class MethodProgram4 {
	public static void m1(int a, int b) {
		System.out.println("m1 method starts");
		System.out.println(a+b);
		m2(a,b);
		System.out.println("m1 method ends");
	}
	public static double m2(int a, double b) {
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println("main method starts");
		m1(10,20);
		double res=m2(10,40);
		System.out.println("res : "+res);
		System.out.println("main method end");

	}
}
