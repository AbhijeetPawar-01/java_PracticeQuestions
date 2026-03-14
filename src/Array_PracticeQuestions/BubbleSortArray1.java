package Array_PracticeQuestions;

import java.util.Arrays;

public class BubbleSortArray1 {
	public static void main(String[] args) {

		int a[] = { 19, 38, 37, 190 };
		int temp;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}

			}

		}

		// System.out.println(Arrays.toString(a));
		for (int e = 0; e < a.length; e++) {
			System.out.println(a[e]);
		}
	}

}
