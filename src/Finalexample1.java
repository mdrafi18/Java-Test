
public class Finalexample1 extends Finalexample{
	
	/*
	 * public void print() { System.out.println("primt in extended class"); }
	 */
	
	
	public static void main(String args[]) {
		
		Finalexample1 a =new Finalexample1();
		Finalexample b=new Finalexample();
		a.print();
		b.print();
		for(int i=0;i<1000;i++) {
			for(int j=0;j<100;j++)
			{
				Finalexample1 c =new Finalexample1();
				c = new Finalexample1();
				c = new Finalexample1();
				c = new Finalexample1();
			}
		}
		
	}
	public void finalize()
	{
		System.out.println("finalize method being called before GC by Sanam");
	}

	
}
