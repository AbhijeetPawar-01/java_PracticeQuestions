package Array;

import java.util.Scanner;

public class singleArray5 {
	public static void main(String[] args) {

		int[] a = new int[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}

	}
}
