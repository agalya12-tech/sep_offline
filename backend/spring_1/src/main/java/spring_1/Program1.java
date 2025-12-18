package spring_1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Program1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			Animal a = new Animal();
			System.out.println(a);
		}
		System.out.println("-------------------------------------");

//		Resource r = new ClassPathResource("bean.xml");
//		BeanFactory bf = new XmlBeanFactory(r);
		ApplicationContext bf=new ClassPathXmlApplicationContext("bean.xml");
		System.out.println(bf);

		for (int i = 1; i <= 10; i++) {
			Animal a = bf.getBean(Animal.class);
			System.out.println(a);
		}
	}
}
