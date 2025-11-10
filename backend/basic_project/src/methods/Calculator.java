package methods;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first value : ");
		int a=sc.nextInt();
		System.out.print("enter second value : ");
		int b=sc.nextInt();
		System.out.print("enter Operation(+,-,*,/,%) : ");
		char symbol=sc.next().charAt(0);
		
		switch (symbol) {
		case '+':add(a,b);break;
		case '-':sub(a,b);break;
		case '*':multiply(a,b);break;
		case '/':division(a,b);break;
		case '%':modules(a,b);break;

		default:System.err.println("please enter correct operation");
			break;
		}
		
	}

	private static void modules(int a, int b) {
	     System.out.println("Modules of "+a+" % "+b+" is "+(a%b));		
		
	}

	private static void division(int a, int b) {
	     System.out.println("Division of "+a+" / "+b+" is "+(a/b));		
		
	}

	private static void multiply(int a, int b) {
	     System.out.println("Multiplication of "+a+" * "+b+" is "+(a*b));		
		
	}

	private static void sub(int a, int b) {
	     System.out.println("Subtraction of "+a+" - "+b+" is "+(a-b));		
		
	}

	private static void add(int a, int b) {
     System.out.println("Addition of "+a+" + "+b+" is "+(a+b));		
	}
}
