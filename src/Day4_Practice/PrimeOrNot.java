package Day4_Practice;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");

		int num = sc.nextInt();
		int temp = 0;

		for (int i = 2; i < num; i++) {

			if (num % 2 == 0) 
			{
				temp = temp + 1;
			}

		}
		if (temp > 1) {
			System.out.println("not prime");
		} else
			System.out.println("prime");
	}

}
