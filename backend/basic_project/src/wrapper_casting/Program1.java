package wrapper_casting;

import java.util.ArrayList;
import java.util.Collection;

public class Program1 {
	public static void main(String[] args) {
           String phone="80123734536734";
           
           long l=Long.parseLong(phone);
           long l1=Long.valueOf(l);
           
           
           Collection<Integer>c=new ArrayList<Integer>();
           c.add(10);
           
           c.add(20);
           c.add(30);
	}
}
