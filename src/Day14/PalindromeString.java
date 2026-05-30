package Day14;

public class PalindromeString {
	public static void main(String[] args) {

		String s = "mada1m";
		String rev = "";
		String orgString = s;

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		System.out.println(rev);

		if (orgString.equalsIgnoreCase(rev)) {
			System.out.println("String is palindrome");

		} else
			System.out.println("String is not palindrome");

	}

}
