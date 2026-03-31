package Day4_Practice;

import java.util.Scanner;

public class Palindrome_String {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String name = sc.next();
		String rev = "";

		String org_String = name;

		for (int i = name.length() - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);

		}

		if (org_String.equals(rev)) {

			System.out.println("String is palindrome");
		} else

			System.out.println("String is not palindrome");

	}

}
