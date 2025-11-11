package methods;

public class Dog {
	String breed, color, gender, name;
	int age;
	double height, weight;

	public static void barking() {
		System.out.println("barking");
	}
	public void eating() {
		System.out.println(name + "eats meat");
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name="Chintu";
		System.out.println(dog.name);//chintu
		System.out.println(dog.breed);//null
		dog.eating();//chintu eats meat
		System.out.println(dog);//address
		Dog dog2 = new Dog();
		System.out.println(dog2.name);//null
		System.out.println(dog2.breed);//null
		dog2.eating();//null eats meat
		System.out.println(dog2);//address
	}
}
