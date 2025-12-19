package spring_1;

public class SingleTonExample {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			SingleTon singleTon = SingleTon.getInstance();
			System.out.println(singleTon);
		}

	}
}
