package Day6;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to check plaindrome");
		int num = sc.nextInt();
		int orgNum = num;
		int rev = 0;

		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);

		if (orgNum == rev) {
			System.out.println("palindrome");

		}

		else
			System.out.println("not palindrome");
	}
}
