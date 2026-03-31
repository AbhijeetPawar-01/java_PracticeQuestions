package Day6;

public class EvenOddFromArray {
	public static void main(String[] args) {

		int a[] = { 11, 20, 30, 40 };
		int even = 0;
		int odd = 0;

		System.out.println("even");

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {

				System.out.println(a[i]);

			}

		}
		System.out.println("odd");

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {

				System.out.println(a[i]);

			}

		}

	}

}
