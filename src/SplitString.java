
public class SplitString {

	public static void main(String[] args) {
		
		String str= "Java,Selenium,Testng";
		
		String str1[]=str.split(",");
		
		for(int i=0;i<str1.length;i++)
		{
			System.out.println(str1[i]);
		}

	}

}
