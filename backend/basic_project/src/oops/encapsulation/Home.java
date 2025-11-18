package oops.encapsulation;

public class Home {

	private String locker="3Kg Gold";
	
//	modify/write  return type-void  arg method
	public void setLocker(String locker) {
		this.locker=locker;
	}
//	read/access   return type   no arg method
	public String getLocker(int pin) {
		if(pin==1234)
		return locker;
		else
			return "Wrong pin";
	}
	
}
