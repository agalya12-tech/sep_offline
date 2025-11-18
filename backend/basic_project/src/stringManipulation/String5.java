package stringManipulation;

public class String5 {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println(buffer);//Hello
		buffer.append(10);//Hello10
//		buffer.repeat("**", 3);//Hello10****** -- 21 version
		buffer.delete(1, 3);//Hlo10
		buffer.deleteCharAt(0);//lo10
		buffer.setCharAt(3, 'X');//lo1X
		buffer.insert(2,"Heelo");
		System.out.println(buffer);
//		buffer.reverse();
//		System.out.println(buffer);

	}

}
