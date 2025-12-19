package spring_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Program1 {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		System.out.println(ac);
		
		for(int i=1;i<=10;i++) {
			Employee e=ac.getBean(Employee.class);
			System.out.println(e);
		}
	}
}
