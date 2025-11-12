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

}
