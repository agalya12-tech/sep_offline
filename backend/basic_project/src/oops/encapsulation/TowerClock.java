package oops.encapsulation;

public class TowerClock {

	public static void main(String[] args) {
		Clock c=new Clock();
		System.out.println(c);
		c.setHrs(30);
		System.out.println(c);
		c.setHrs(3);
		c.setMin(34);
		c.setSec(42);
		System.out.println(c);
	}
}
