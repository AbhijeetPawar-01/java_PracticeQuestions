package Day13;

public class RemoveSpecialChar {

	public static void main(String[] args) {

		String s = "@!E$#@!! Selenium";

		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
