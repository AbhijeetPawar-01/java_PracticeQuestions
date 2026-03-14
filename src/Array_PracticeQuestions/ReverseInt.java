package Array_PracticeQuestions;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();

		int rev = 0;

		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;
			// num %10---> gives reminder
			//quotient

		}

		System.out.println(rev);
	}

}
