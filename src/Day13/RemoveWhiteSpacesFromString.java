package Day13;

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) {

		String s = "Welcome to java selenium";

		s = s.replaceAll("\\s", "");
		System.out.println(s);

	}

}
