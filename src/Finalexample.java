
public class Finalexample {

	public final static String name="test";
	
	public final void print()
	{
		System.out.println("print in final example");
	}
	
	public static void main(String args[]){
		/**
		 * 
		 * we can not reassign any other value to final variable
		 * 
		 **/
//		name="hello"; 
		
		System.out.println(name);
		
	}
	
}
