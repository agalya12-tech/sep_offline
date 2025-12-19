package spring_1;

public class SingleTon {
	
	private static SingleTon instance;
	
	private SingleTon() {
    // private const won't allow to use outside class
	}
	
	public static SingleTon getInstance() {
    // having a condition to avoid creating a object more than one time
		if(instance==null) {
			instance=new SingleTon();
		}
		return instance;
	}

}
