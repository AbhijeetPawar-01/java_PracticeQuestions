package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArray1 {
	public static void main(String[] args) {

		int[][] a = new int[3][2];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {

			for (int c = 0; c < a[i].length; c++) {

				a[i][c] = sc.nextInt();

			}

		}

//		for (int i = 0; i < a.length; i++) {
//
//			for (int c = 0; c < a[i].length; c++) {
//
//				System.out.println(a[i][c]);
//			}
//
//		}

		for (int[] x : a) {
			System.out.println(Arrays.toString(x));
		}

	}

}
