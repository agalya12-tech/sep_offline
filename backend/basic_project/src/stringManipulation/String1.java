package stringManipulation;

public class String1 {
	public static void main(String[] args) {

		String s1="Apple"; //string pool area -- 0X1
		System.out.println(s1);//Apple
		
		String s2="Apple";//String pool area --0X1
		System.out.println(s2);//Apple
		
		String s3=new String("Apple");//heap area --0X2
		System.out.println(s3);//Apple
		
		String s4="apple";//static pool area -0X3
		System.out.println(s4);
//		equal to operator  will check address 
		System.out.println(s1==s2);//0X1==0X1  --true
		System.out.println(s1==s3);//0X1==0X2  --false
		System.out.println(s1==s4);//0X1==0x3  --false
		
//		equals and equalsIgnoreCase will check values rather than address
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
//		won't bother about case
		System.out.println(s1.equalsIgnoreCase(s4));

	}
}
