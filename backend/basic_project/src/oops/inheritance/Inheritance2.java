package oops.inheritance;

public class Inheritance2 {
	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.eats();//Animal is eating
		Dog dog=new Dog();
		dog.eats();//Dog eats meat...
	}}
class Animal{
	 public void eats() {
		 System.out.println("animal is eating ....");
	 }
}
class Dog extends Animal{
	@Override
	public void eats() {
		// TODO Auto-generated method stub
		super.eats();
		System.out.println("Dog eats meat ...");
	}
}