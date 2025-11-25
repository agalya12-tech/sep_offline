package wrapper_casting;

import java.sql.Connection;
import java.sql.DriverManager;

public class NonPrimitiveCasting {
	public static void main(String[] args) {
//		 storing child in parent
		Father father = new Son(); // implicit ---UpCasting
		System.out.println(father);

//		checking parent refernce consist son object
		if (father instanceof Son) {
//			 converting parent to child
			Son son = (Son) father; // explicit --downCasting
			System.out.println(son);
		}

//		checking parent refernce consist daughter object
		if (father instanceof Daughter) {
// in father ref daughther object is not exist so,ClassCastException will occur
			Daughter d = (Daughter) father; 
			System.out.println(d);
		}
		
	}
}



class Father {
	public void method() {
		System.out.println("Father Method");
	}
}
class Son extends Father {
	@Override
	public void method() {
		System.out.println("Son Method");
	}
}
class Daughter extends Father {
	@Override
	public void method() {
		System.out.println("Daughter Method");
	}
}