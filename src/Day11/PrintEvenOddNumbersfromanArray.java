package Day11;

public class PrintEvenOddNumbersfromanArray {

	public static void main(String[] args) {

		int a[] = { 10, 11, 12, 23, 34 };

		int even = 0;
		int odd = 0;
		System.out.println("even number are");
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {

				System.out.println(a[i]);

			}

		}

		System.out.println("odd number are");
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {

				System.out.println(a[i]);

			}

		}

	}

}
