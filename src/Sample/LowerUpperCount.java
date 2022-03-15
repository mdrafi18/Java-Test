package Sample;

public class LowerUpperCount {

	public static void main(String[] args) {

		String Str = "AbcBfdhglkdfjhgkldjfgHGJDFHGKDS", upper = "", lower = "";
		
		for (int i = 0; i < Str.length(); i++) {
			if (Str.charAt(i) >= 'A' && Str.charAt(i) <= 'Z') {

				upper = upper + Str.charAt(i);
				
			} else if (Str.charAt(i) >= 'a' && Str.charAt(i) <= 'z') {

				lower = lower + Str.charAt(i);

			}
			
		}

		System.out.println(lower);
		System.out.println(lower.length());
		System.out.println(upper);
		System.out.println(upper.length());
	}

}
