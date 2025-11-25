package wrapper_casting;

public class NonPrimitiveCasting2 {
	public static void main(String[] args) {
		Father f = new Father();
		parentMethdod(f);
		parentMethdod(new Son()); // UpCasting
		parentMethdod(new Daughter());// UpCasting

		System.out.println("==============================");
		System.out.println();
		System.out.println("==============================");

		childMethod(new Son());
		Father f1 = new Son();// UpCasting
		if (f1 instanceof Son) {
			childMethod((Son) f1); // DownCasting
		}

		Father f2 = new Daughter();// UpCasting
		if (f2 instanceof Son) {
			childMethod((Son) f2);// DownCasting
		}
	}

	public static void parentMethdod(Father father) {
		System.out.println(father);
	}

	public static void childMethod(Son son) {
		System.out.println(son);
	}
}
