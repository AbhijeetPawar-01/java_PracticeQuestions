package Array_Questions_Day5;

public class PrintEvenOddFromArray {
	public static void main(String[] args) {

		int a[] = { 12, 11, 24, 35, 46 };

		int evenCount = 0;
		int oddcount = 0;
		System.out.println("even numbers are");
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {

				System.out.println(a[i]);
			}

		}
		System.out.println("odd numbers are");
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {

				System.out.println(a[i]);
			}

		}

	}
}
