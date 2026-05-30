package Day22;

public class Descen_sort {
	public static void main(String[] args) {

		int a[] = { 39, 17, 10, 9, 8, 22 };

		int temp;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {

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
