package Day84;

public class EqualityOfArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };
		int b[] = { 1, 2, 3, 4, 5 };

		boolean status = true;

		if (a.length == b.length) {

			for (int i = 0; i < a.length; i++) {

				if (a[i] != b[i]) {

					status = true;

				}

			}

		} else {
			status = false;

		}

		if (status == true) {
			System.out.println("equal");
		} else

			System.out.println("not equal");

	}
}
