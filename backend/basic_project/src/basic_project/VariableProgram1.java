package basic_project;
/*
 * Variable: It is a container to store data
 * Types:
 *     1.Scope: 1.Local
 *              2.Global: a.static
 *                        b.non static
 *                        
 *     2.DataType:1.Primitive Variable
 *                2.Non Primitive Varaible
 * */
public class VariableProgram1 {

	public static void main(String[] args) {
		int value; //declaration
//		System.out.println(value);CTE
		value=10;//assigning or initalizing
		System.out.println(value);//10
		value=20;// re-assigning or re-initalizing
		System.out.println(value);//20
		
//		----------------Based on Datatype-----------
		
//		 value1- value1 is a primitive variable 
		int value1=10;// declaring and assiging
//		 value2 - value2 is a non primitive variable
		String value2="radha";
	}
}




