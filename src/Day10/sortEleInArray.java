package Day10;

public class sortEleInArray {
	public static void main(String[] args) {

		int a[] = { 10, 12, 90, 23, 9, 8, 7 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length-1; j++) {

				if (a[j] > a[j + 1]) {

					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}

			}

			for (int x : a) {
				System.out.println(x);

			}
		}

	}

}
