package Day22;

public class findDfirstDupli {
	public static void main(String[] args) {

		int a[] = { 10, 20, 10, 20, 40 };
		boolean found = false;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {

					System.out.println("first dupli is" + a[i]);
					found = true;
					return;

				}

			}

			if (found) {
				break;
			}

		}
	}
}
