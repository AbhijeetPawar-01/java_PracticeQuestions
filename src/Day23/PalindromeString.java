package Day23;

public class PalindromeString {

	public static void main(String[] args) {

		String s = "madaqqm";
		String rev = "";

		String orgString = s;

		char[] words = s.toCharArray();

		for (int i = words.length - 1; i >= 0; i--) {

			rev = rev + words[i];

		}
		System.out.println(rev);

		if (orgString.equals(rev)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}

	}

}
