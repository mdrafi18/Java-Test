package Sample;

public class factorial {
	
	
	public static int facto(int n)
	{
		int fact=1;
		for (int i=n;i>0;i--) {
			fact=fact*i;
			
		}
		return fact;
		
	}

	public static void main(String[] args) {
		
		System.out.println("factorial of 5 is : "+facto(5));
		System.out.println("factorial of 4 is : "+facto(4));
		System.out.println("factorial of 3 is : "+facto(3));
	}

}
