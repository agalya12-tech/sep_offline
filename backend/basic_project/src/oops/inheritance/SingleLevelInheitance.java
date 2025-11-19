package oops.inheritance;
public class SingleLevelInheitance {
	public static void main(String[] args) {
		System.out.println("-----parent class------");
      Parent p=new  Parent();
      System.out.println(p.parentValue);
//      System.out.println(p.childValue); it is present in child class
      System.out.println("----child class----");
      Child c=new Child();
      System.out.println(c.parentValue);
      System.out.println(c.childValue);
	}}
class Parent{
	String parentValue="parentValue";
}
class Child extends Parent{
	String childValue="Child value member";
}