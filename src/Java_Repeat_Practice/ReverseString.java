package Java_Repeat_Practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		String name = sc.next();

		String rev = "";
//
//		for (int i = name.length() - 1; i >= 0; i--) {
//
//			rev = rev + name.charAt(i);
//
//		}

		// by converting Sring into char array
		char[] nam = name.toCharArray();

		for (int i = name.length() - 1; i >= 0; i--) {

			rev = rev + nam[i];

		}
		System.out.println(rev);

	}

}
