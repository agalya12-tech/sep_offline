package arrayManipulation;

public class Array7 {

	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80 ,90} };
	     System.out.println("Sum of 2D Array : "+sum(arr));
	     System.out.println("Product of 2D Array : "+product(arr));

	}
	public static int sum(int[][]arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
		}
		return sum;
	}
	public static long product(int[][]arr) {
		long prod=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				prod*=arr[i][j];
			}
		}
		return prod;
	}
}
