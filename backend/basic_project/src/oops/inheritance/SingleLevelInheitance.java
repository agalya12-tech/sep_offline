package oops.inheritance;
public class SingleLevelInheitance {
	public static void main(String[] args) {
		System.out.println("-----parent class------");
      Parent p=new  Parent();
      System.out.println(p.parentValue);
      System.out.println("----child class----");
      Child c=new Child();
      System.out.println(c.parentValue);
	}}
class Parent{
	String parentValue="parentValue";
}
class Child extends Parent{
	
}