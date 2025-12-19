package spring_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Program3 {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(EmployeeConfig.class);
        System.out.println(ac.getBean(Employee.class));
	}
}
