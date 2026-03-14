package Array;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayConcept {

	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		int a[] = new int[4];
//
//		for (int i = 0; i < a.length; i++) {
//
//			a[i] = sc.nextInt();
//
//		}
//
//		for (int x : a) {
//
//			System.out.print(x + " ");
//		}

		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];

		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();

		}
//		for (int i = 0; i < a.length; i++) {
//
//			System.out.println(a[i]);
//
//		}

//		for (int x : a) {
//
//			System.out.println(a);
//		}

		String ab = Arrays.toString(a);
		System.out.println(ab);

	}
}
