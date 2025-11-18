package oops.encapsulation;

public class Clock {
	private int hrs, min, sec;

//	public Clock(int hrs, int min, int sec) {
//		super();
//		this.hrs = hrs;
//		this.min = min;
//		this.sec = sec;
//	}

	@Override
	public String toString() {
		return "The Current time is "+hrs+" hrs : "+min+" min : "+sec+" sec";
		
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		if (hrs >= 1 && hrs <= 12) {
			this.hrs = hrs;
		}
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if(min>=1&&min<=60)
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		if(sec>=1&&sec<=60)
		this.sec = sec;
	}

}
