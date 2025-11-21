package oops.abstraction;

public class ConstructorChaining  {
	int a;
	
	public ConstructorChaining(int a) {
		super();
		this.a = a;
	}
	

	public ConstructorChaining() {
//		super();
	}


	public static void main(String[] args) {
		ConstructorChaining chaining=new ConstructorChaining();
	}
}
