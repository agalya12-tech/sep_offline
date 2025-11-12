package methods;

public class MobileShop {
	
	public static void main(String[] args) {
	
     Mobile m=new Mobile(); // new keyword constructor call
     System.out.println(m+" before assigning");
     m.storage=16;
     m.brand="Vivo";
     System.out.println(m+" after assigning");
     
     System.out.println("=================================================");
     System.out.println();
     System.out.println("==================================================");
     
     Mobile m1=new Mobile("OPPO"); 
     System.out.println(m1+" 1 argu ");
     
     
     System.out.println("=================================================");
     System.out.println();
     System.out.println("==================================================");
     
     Mobile m2=new Mobile(16,"OPPO"); 
     System.out.println(m2+" 2 argu ");
    
	}
}
