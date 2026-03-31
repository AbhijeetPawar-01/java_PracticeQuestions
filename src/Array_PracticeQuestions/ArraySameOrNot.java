package Array_PracticeQuestions;

import java.util.Arrays;

public class ArraySameOrNot {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = {  2, 3, 4, 5 };

		// method 1
		boolean status1 = Arrays.equals(a, b);

		System.out.println(status1);

		// method 2 using condition

		boolean status = true;

		if (a.length == b.length) {

			for (int i = 0; i < a.length; i++) {

				if (a[i] != b[i]) {
					status = false;
				}

			}

		} else {
			status = false;
		}
		
		
		if (status = true) {
			System.out.println("same1");
		} else
			System.out.println("not same");

	}

}
