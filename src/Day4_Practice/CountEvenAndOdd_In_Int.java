package Day4_Practice;

import java.util.Scanner;

public class CountEvenAndOdd_In_Int {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int evenCount = 0;
		int oddcount = 0;

		while (num != 0) {

			int rem = num % 10; /// this wll give remander

			if (rem % 2 == 0) {
				evenCount++;
			} else {

				oddcount++;
			}
			num = num / 10;

		}
		System.out.println(evenCount);
		System.out.println(oddcount);

	}
}
