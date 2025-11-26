package wrapper_casting;
// primitive data type into non primitive data type -- Boxing
public class Boxing {
 public static void main(String[] args) {
	 byte byteValue=-127;
	 short shortValue=234;
	 int intValue=10;
	 long longValue=2344324234l;
	 double doubleValue =234.234;
	 float floatValue=5464564.345f;
	 char charValue='a';
	 boolean booleanValue=false;
//	 Wrapper Class ref= primitveValue
	      Byte      b =  byteValue;
	      Byte b1=Byte.valueOf(byteValue);
	 Short s=shortValue;
	 Integer i=intValue;
	 Long l=longValue;
	 Double d=doubleValue;
	 Float f=floatValue;
	 Character c=charValue;
	 Boolean bo=booleanValue;
		
}
}
