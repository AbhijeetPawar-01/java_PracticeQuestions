package Array_PracticeQuestions;

import java.util.Scanner;

public class palindrome {
// it's a number -if we do rev then also looks same

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int fixnum = num;

		int rev = 0;

		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		System.out.println(rev);

		if (rev == fixnum) {

			System.out.println("its a palindrome number");
		} else

			System.out.println("not a palindrome");

	}

}
