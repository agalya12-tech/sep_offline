package methods;

public class Program2 {
	public void m1() {
		System.out.println(Program1.staticVariable);
		Program1.staticMethod();

		Program1 p = new Program1();
		p.instanceMethod();
		System.out.println(p.instanceVariable);
	}

	public static void m2() {
		System.out.println(Program1.staticVariable);
		Program1.staticMethod();

		Program1 p = new Program1();
		p.instanceMethod();
		System.out.println(p.instanceVariable);
	}
}
