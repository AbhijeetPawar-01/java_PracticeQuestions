package Day22;

public class StringPalindromeCheck {
	public static void main(String[] args) {

		String s = "madam";

		String rev = "";
		String orgString = s;

		char[] a = s.toCharArray();

		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + a[i];

		}

		System.out.println("rev string is " + rev);

		if (orgString.equalsIgnoreCase(rev)) {
			System.out.println("palindrome ");
		} else

			System.out.println("not a palindrome");

	}

}
