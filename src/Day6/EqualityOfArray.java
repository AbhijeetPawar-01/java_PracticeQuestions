package Day6;

public class EqualityOfArray {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 1, 2, 3, 4, 5 };

		boolean status = true;

		if (a.length == b.length) {

			for (int i = 0; i < a.length; i++) {

				for (int j = 0; j < a.length; j++) {

					if (a[i] == a[j]) {

						status = true;

					}

				}

			}

		} else {

			status = false;
		}

		if (status == true) {
			System.out.println("Aray are equal");

		} else {

			System.out.println("arrays are not equal");
		}

	}

}
