package methods;

public class Cat {
	String eyeColor;
	String name;
	double weight;

	@Override
	public String toString() {
		return "Cat [eyeColor=" + eyeColor + ", name=" + name + ", weight=" + weight + "]";
	}

	public Cat(String eyeColor, String a, double weight) {
		// assigning local into global but both local and global names are same
//		 to indicated global object members will use this keyword in left side
		this.eyeColor = eyeColor;
//		global and local members are different so , no need of this keyword
		name = a;
		this.weight = weight;
	}

	public Cat() {
	}

}
