
package Array_PracticeQuestions;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");

		String s = sc.next();
		int len = s.length();
		
		String org_String = s;

		String rev = "";
		for (int i = len - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);

		}
		System.out.println(rev);

		if (org_String.equals(rev)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}
}