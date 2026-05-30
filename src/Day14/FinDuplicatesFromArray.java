package Day14;

public class FinDuplicatesFromArray {
	public static void main(String[] args) {

		int a[] = { 100, 10, 20, 20, 10 };
		boolean status = false;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					System.out.println("dupli ele is :" + a[j]);
					status = true;

				}

			}
			if (status = false) {
				System.out.println("dupli not found");
			}

		}

	}

}
