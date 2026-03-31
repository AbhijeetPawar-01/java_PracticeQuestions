package Day84;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class scannerArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a[] = new String[3];

		for (int i = 0; i < a.length; i++) {

			a[i] = sc.next();
		}

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

	}
}
