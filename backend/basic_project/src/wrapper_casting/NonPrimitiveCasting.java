package wrapper_casting;

import java.sql.Connection;
import java.sql.DriverManager;

public class NonPrimitiveCasting {
	public static void main(String[] args) {
		Father father = new Son(); // implicit ---UpCasting
		System.out.println(father);

		if (father instanceof Son) {
			Son son = (Son) father;
			System.out.println(son);
		}

		if (father instanceof Daughter) {
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