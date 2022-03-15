
public class conatenateString {

	public static void main(String[] args) {
		
		String S1="ABC";
		String S2="XYZ";
		String S3="PQR";
		
		System.out.println(S1+S2+S3);
		System.out.println(S1.concat(S2).concat(S3).concat(S3).concat(S2).concat(S3));

	}

}
