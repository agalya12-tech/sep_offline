package oops.abstraction;

class Developer extends Employee {
	String language;
	int exp;
	String email;
	long phone;

	@Override
	public String toString() {
		return "Developer [language=" + language + ", exp=" + exp + ", email=" + email + ", phone=" + phone + "]";
	}

	public Developer(String language) {

		this.language = language;
	}

	public Developer(String language, int exp) {
//		super();
//		this.language = language;
		this(language);
		this.exp = exp;
	}

	public Developer(String language, int exp, String email) {
//		super();
//		this.language = language;
//		this.exp = exp;
		this(language, exp);
		this.email = email;
	}

	public Developer(String language, int exp, String email, long phone) {
		this(language, exp, email);
//		super();
//		this.language = language;
//		this.exp = exp;
//		this.email = email;
		this.phone = phone;
	}

	

	public Developer(String name, int age, long phone) {
		super(name, age, phone);
	}

}

public class Abstraction3 {
	public static void main(String[] args) {
		Developer d = new Developer("JAVA");
		System.out.println(d);

		Developer d2 = new Developer("JAVA", 5);
		System.out.println(d2);

		Developer d3 = new Developer("JAVA", 5, "raj@excelr.com");
		System.out.println(d3);

		Developer d4 = new Developer("JAVA", 5, "raj@excelr.com", 75432673253l);
		System.out.println(d4);

//	  ===================================

		Employee employee = new Developer("Raj", 23, 328476364);
		employee.project();

	}
}

abstract class Employee {
	String name;
	int age;
	long phone;

	public Employee(String name, int age, long phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	public void project() {
		System.out.println("Employee [name=" + name + ", age=" + age + ", phone=" + phone + "]");
	}

	public Employee() {
		super();
	}

}
