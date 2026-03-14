package Array;

import java.util.Scanner;

public class MultipleArray5 {
	public static void main(String[] args) {

		int[][] a = new int[3][2];
		Scanner sc = new Scanner(System.in);

		for (int r = 0; r < a.length; r++) {

			for (int c = 0; c < a[r].length; c++) {
				a[r][c] = sc.nextInt();
			}
		}

		for (int r = 0; r < a.length; r++) {

			for (int c = 0; c < a[r].length; c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}

	}

}
