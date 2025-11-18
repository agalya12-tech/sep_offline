package oops.encapsulation;

public class TowerClock {

	public static void main(String[] args) {
		Clock c=new Clock();
		System.out.println(c);
		c.setHrs(30);
		System.out.println(c);
		c.setHrs(23);
		System.out.println(c);
	}
}
