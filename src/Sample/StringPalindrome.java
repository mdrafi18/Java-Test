package Sample;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String str="sanam",rev=str,result="";
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(str.charAt(i));
			result=result+str.charAt(i);
		}
		System.out.println(result);
		
		if(rev.equalsIgnoreCase(result)){
			System.out.println("provided String is palindrome");
		}
		else{
			
				System.out.println("Provided String not palindrome");
			}
		
	}

}
