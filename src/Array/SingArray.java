package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] a = new String[3];

		for (int i = 0; i < a.length; i++) {

			a[i] = sc.next();
		}

//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}

//		for(String x : a) {
//			System.out.println(x);
//		}

		System.out.println(Arrays.toString(a));

	}
}
