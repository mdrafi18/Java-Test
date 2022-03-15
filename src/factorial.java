
public class factorial {
	
	
	public static int facto(int n)
	{
		int fact=1;
		for (int i=n;i>0;i--) {
			fact=fact*i;			
		}
		return fact;
		
	}
	
	public static int recursiveFactorial(int n, int result) {
		int factorial = n*result;
		n--;
		if(n>1) {
			return recursiveFactorial(n, factorial);
		} else {
			return factorial;
		}
	}
	 

	public static void main(String[] args) {		
		System.out.println("factorial of 5 is : "+facto(5));
		System.out.println("factorial of 4 is : "+facto(4));
		System.out.println("factorial of 3 is : "+facto(3));
		
		int result =1;		
		System.out.println("factorial of 5 is : "+recursiveFactorial(5,result));
		System.out.println("factorial of 4 is : "+recursiveFactorial(4,result));
		System.out.println("factorial of 3 is : "+recursiveFactorial(3,result));
	}
	
	
	
	
	
	
	
	
	
	

}
