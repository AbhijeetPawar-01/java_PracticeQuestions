package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArray2 {
	public static void main(String[] args) {

		int[][] a = new int[2][2];
		Scanner sc = new Scanner(System.in);

		for (int r = 0; r < a.length; r++) {

			for (int c = 0; c < a[r].length; c++) {

				a[r][c] = sc.nextInt();

			}

		}

//		for (int[] x : a) {
//			System.out.println(Arrays.toString(x));
//		}

		for (int i = 0; i < a.length; i++) {

			for (int c = 0; c < a[i].length; c++) {

				System.out.print(a[i][c] + " ");

			}
			System.out.println();
		}

	}

}
