package modifier2;
import modifier1.Program1;


public class Program4  extends Program1{
	public static void main(String[] args) {
		Program1 program1=new Program1();
		Program4 program4=new Program4();
		System.out.println(program1.publicVariable);
		System.out.println(program4.protectedVariable);
//		System.out.println(program1.protectedVariable);v
//		System.out.println(program1.defaultVariable);
//		System.out.println(program1.privateVariable);
	}
}
