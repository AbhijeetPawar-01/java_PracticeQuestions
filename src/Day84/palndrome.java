package Day84;

import java.util.Scanner;

public class palndrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter string to check palindrome or not");
		String name = sc.next();

		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);

		}
		System.out.println(rev);

		if (name.equals(rev)) {

			System.out.println("its a palindrome");
		} else
			System.out.println("not a palindrome");

	}

}
