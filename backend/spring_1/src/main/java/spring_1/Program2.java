package spring_1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Program2 {
	public static void main(String[] args) {
	
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("animal.xml"));
		System.out.println(bf);
		
	   Animal a=	bf.getBean(Animal.class);
	   System.out.println(a);
	}
}
