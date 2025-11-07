package basic_project;
import java.util.Scanner;
public class DynamicProgram {
//  name ,email,phone,age,gender,address,salary, maritalstatus
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter name");
	String name=s.nextLine();
	System.out.println("enter age");
	int age=s.nextInt();
	System.out.println("enter gender");
	char gender=s.next().charAt(0);
	System.out.println("Name : " +name);
	System.out.println("Age : " +age);
	System.out.println("Gender : " +gender);
	}
}
