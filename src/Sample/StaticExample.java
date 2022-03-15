package Sample;

public class StaticExample {
	public static int i=2; 
	StaticExample()
	{
		System.out.println("contrsuctor called");
		i=i*5;
		System.out.println(i);
	}
	
	static {
		System.out.println("static block"+i*5);
	}
	
	public static void test(){
		System.out.println("static method is invoked"+i);
	}


	public static void main(String[] args) {
		
		StaticExample a=new StaticExample();
		StaticExample b=new StaticExample();
		StaticExample c=new StaticExample();
		StaticExample.test();

	}

}
