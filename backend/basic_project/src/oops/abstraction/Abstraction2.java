package oops.abstraction;

public class Abstraction2 {

}

class Demo1 {
	static int a;
	double d;

	public void m1() {

	}

	public static void m2() {

	}

	public Demo1(double d) {
		super();
		this.d = d;
	}

//	public abstract void m3(); 
// not allowed, bcoz incomplete methods not allowed in complete class
}

// we can't achieve 100% abstraction - 
//it accepts complete and incomplete methods(instance methods)
abstract class Demo2 {
	static int a;
	double d;

	public void m1() {

	}

	public static void m2() {

	}

	public Demo2(double d) { // for const chaining not for object creation
		super();
		this.d = d;
	}

	public abstract void m3();
//	public abstract static void m4(); static methods can't be abstract ,
//	abstract will applicable to only insatnce
}




// we can achieve 100% abstraction - it accepts only abstract method
interface Demo3 {
	void m3(); // public , abstract
	int a = 10; // public static final variables
	
//	from java 8  -- can't override these 2 methods
	public static void m1() {
		
	}
	
	default void m2() {
		
	}
	
//	 it won't allow const , non static complete methods , non static variables

}
