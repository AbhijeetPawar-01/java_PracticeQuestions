package Day3practice;

public class PalindromeString {
	public static void main(String[] args) {

		String name = "mdam";
		String org = name;
		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);

		}

		if (org.equals(rev)) {
			System.out.println("String is palimdrome");

		} else

			System.out.println("String is not palindrome");

	}
}
