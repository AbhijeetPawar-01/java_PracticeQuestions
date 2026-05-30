package Day15;

public class bubbleSort {
	public static void main(String[] args) {

		int a[] = { 10, 11, 6, 5, 1, 8 };
		int temp = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] > a[j + 1]) {

					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}

			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}

	}

}
