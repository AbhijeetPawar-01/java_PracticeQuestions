package Day19;

public class bubbleSort {
	public static void main(String[] args) {

		int a[] = { 9, 8, 7, 2, 4 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}

	}
}
