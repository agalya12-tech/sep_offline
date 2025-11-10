package basic_project;

import java.util.Scanner;

//  male female other
public class Conditional1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your gender");
		char gender = sc.next().charAt(0);
//		if (gender == 'F' || gender == 'f') {
//			System.out.println("Female");
//		} else if (gender == 'M' || gender == 'm') {
//			System.out.println("Male");
//		} else {
//			System.out.println("Other");
//		}
		
		switch (gender) {
		case 'F':System.out.println("FEMALE");break;
		case 'f':System.out.println("FEMALE");break;
		case 'M':System.out.println("MALE");break;
		case 'm':System.out.println("MALE");break;
		default:System.out.println("Other");break;
		}
		
	}
}
