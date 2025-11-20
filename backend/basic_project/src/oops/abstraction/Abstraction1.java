package oops.abstraction;

import java.util.ArrayList;
import java.util.List;

abstract class Person { // abstract class/ incomplete class
	public abstract void browsing(); //abstract method

}
class PersonChild extends Person { // concrete class
	@Override
	public void browsing() { // concrete / implemented method
		System.out.println("Browsing java oops concept");
	}
}
public class Abstraction1 {
	public static void main(String[] args) {
      Person p=new PersonChild(); // storing child object in Parent reference
      p.browsing(); // calling parent abstract method   
      List list=new ArrayList();
      list.add(10);
      
      
	}
}
