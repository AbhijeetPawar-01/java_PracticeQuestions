package Day14;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {

		String s = "welcome to java";

		s = s.replaceAll("\\s", "");
		System.out.println(s);

	}

}
