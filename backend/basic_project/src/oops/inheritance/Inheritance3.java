package oops.inheritance;

public class Inheritance3 {
	
	public static void main(String[] args) {
		Father father=new Father();
		father.m2();// static 
		father.m1();// non static
		 System.out.println("=============================");
		father=new Son();// ---- child object 
		father.m2();//static  -- parent implemenatation
		father.m1();//non static -- child implementation
	}

}

class Father {

	private void privateMethod() { // private method can't override
		System.out.println("private Method..");
	}
	void m1() { // default method
		System.out.println("m1 default parent  method");
	}
	static void m2() {
		System.out.println("m2 static parent method");
	}
	public final void m3() {// final method can't override
		System.out.println("m3  final method");
	}
}
class Son extends Father {
	@Override
	public void m1() { // visibilty can be more or equal to parent methods 
	System.out.println("m1 in child");
	}
	
	static void m2() {
		System.out.println("m2  static child method");
	}


}