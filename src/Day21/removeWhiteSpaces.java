package Day21;

public class removeWhiteSpaces {
	public static void main(String[] args) {

		String s = "welcome to java";

		s = s.replaceAll("\\s", "");
		
		System.out.println(s);

	}

}
