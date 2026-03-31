package Day6;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string to check palindrome");
		String s = sc.next();
		String rev = "";

		String orgS = s;

		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);

		}
		System.out.println(rev);

		if (orgS.equals(rev)) {
			System.out.println("String is palindrome");

		}

		else
			System.out.println("not palindrome");

	}

}
