package Java_Repeat_Practice;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to check");

		String name = sc.next();
		String orgString = name;
		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);

		}
		System.out.println("rev is" + rev);

		if (orgString.equals(rev)) {
			System.out.println("palindrome String");
		} else
			System.out.println("no palindrome");
	}

}
