package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDArray {
	public static void main(String[] args) {

		int[][] a = new int[3][2];
		Scanner sc = new Scanner(System.in);
//		a[0][0] = 10;
//		a[0][1] = 20;

//		a[1][0] = 10;
//		a[1][1] = 10;

//		a[2][0] = 10;
//		a[2][1] = 10;

		for (int r = 0; r < a.length; r++) {

			for (int c = 0; c < a[r].length; c++) {

				a[r][c] = sc.nextInt();

			}
		}
//		for (int r = 0; r < a.length; r++) {
//
//			for (int c = 0; c < a[r].length; c++) {
//
//				System.out.print(a[r][c] + " ");
//
//			}
//			System.out.println();
//		}
//		

		// by using for loop and Arrays.toString methos
//		for (int r = 0; r < a.length; r++) {
//			System.out.println(Arrays.toString(a[r]));
//		}

		// by using enhamced loop
		for (int[] x : a) {
			System.out.println(Arrays.toString(x));
		}

	}

}
