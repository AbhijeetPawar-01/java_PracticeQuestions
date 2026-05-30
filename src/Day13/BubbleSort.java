package Day13;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = { 54, 89, 12, 22, 11, 10, 9 };
		int temp = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {

				if (a[i] > a[j + 1]) {

					if (a[j] > a[j + 1]) {

						temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;

					}

				}

			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}

	}

}
