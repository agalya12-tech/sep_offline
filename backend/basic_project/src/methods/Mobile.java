package methods;

public class Mobile {
	int storage;
	String brand;
	double price;
	int pixcels;
	double weight;
	@Override// override annotation
//	to print object values rather than object address
	public String toString() {
		return "Mobile [storage=" + storage + ", brand=" + brand + ", price=" + price + ", pixcels=" + pixcels
				+ ", weight=" + weight + "]";
	}
	
	public Mobile() {
		System.out.println("default const--- no args");
	}

	public Mobile(String brand) {
		System.out.println("user defined const -- 1 args");
		this.brand =brand;
	}
	
	public Mobile(int storage,String brand) {
		System.out.println("user defined const -- 2 args");
		this.storage=storage;
		this.brand =brand;
	}

}
