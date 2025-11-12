package modifier1;

public class Program1 {
	public int publicVariable;
	protected String protectedVariable;
	double defaultVariable;
	private long privateVariable;
	
	public static void main(String[] args) {
		Program1 program1=new Program1();
		System.out.println(program1.publicVariable);
		System.out.println(program1.protectedVariable);
		System.out.println(program1.defaultVariable);
		System.out.println(program1.privateVariable);
	}
}
