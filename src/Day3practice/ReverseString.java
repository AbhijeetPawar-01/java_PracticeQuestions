package Day3practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String name = sc.next();
		int len = name.length();
		System.out.println(len);
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);
		}

		System.out.println(rev);
	}
}
