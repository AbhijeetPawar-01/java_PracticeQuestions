package Array_PracticeQuestions;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.next();
		char a[] = s.toCharArray();
		int len = a.length;
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {

			rev = rev + a[i];
		}
		System.out.println(rev);
	}
}
