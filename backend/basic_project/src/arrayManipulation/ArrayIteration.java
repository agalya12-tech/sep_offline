package arrayManipulation;

public class ArrayIteration {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int size = arr.length;
		System.out.println("============================");
		System.out.println("=======while loop ==========");
		System.out.println("============================");
		int i = 0;
		while (i < arr.length) {
			System.out.println(arr[i]);
			i++;
		}

		System.out.println("============================");
		System.out.println("======= do while loop ======");
		System.out.println("============================");
		int j = 0;
		do {
			System.out.println(arr[j]);
			j++;
		} while ((j < arr.length));

		System.out.println("============================");
		System.out.println("======= for loop ===========");
		System.out.println("============================");
		for (int a = 0; a < size; a++) {
			System.out.println(arr[a]);
		}
		
		
		System.out.println("============================");
		System.out.println("======= for each loop ======");
		System.out.println("============================");
		for (int a:arr) {
			System.out.println(a);
		}
	}
}
