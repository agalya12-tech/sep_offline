package methods;

public class Program1 {
	int instanceVariable;
	static String staticVariable;
	static {
		System.out.println(" static initilizers");
	}
	{
		System.out.println("non static initilizers");
	}
	public void instanceMethod() {
		System.out.println("instance Method");
	}
	public static void staticMethod() {
		System.out.println("static Method");
	}
	
	
	
	
//	
//	public static void m1() {
////		 System.out.println(instanceVariable);
//		 System.out.println(staticVariable);
//		 staticMethod();
////		 instanceMethod();
//		 Program1 program1=new Program1();
//		 System.out.println(program1.instanceVariable);
//		 program1.instanceMethod();
//	}
//	public void m2() {
//		System.out.println(instanceVariable);
//		System.out.println(staticVariable);
//		staticMethod();
//		instanceMethod();
//	}
	
	public static void main(String[] args) {
		 System.out.println(staticVariable);
		 staticMethod();
		 System.out.println(staticVariable);
		 staticMethod();
		 
		 Program1 program=new Program1();
		 System.out.println(program.instanceVariable);
		 program.instanceMethod();
		 Program1 program1=new Program1();
		 System.out.println(program1.instanceVariable);
		 program1.instanceMethod();
		 
		 /**
		  * Expected O/p -- null staticMethod null staticMethod 0 instanceMethod 0 instanceMethod
		  * 
		  * Actual o/p--static initlizers  
		  *                 null staticMethod null staticMethod
		  *             non static initlizers
		  *                 0 instanceMethod
		  *             non static initlizers
		  *                 0 instanceMethod
		  *                 
		  */	 
		 
	}
	
	

}
