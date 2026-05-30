package Day22;

public class find2ndDupli {
	public static void main(String[] args) {
		int a[] = { 10, 20, 10, 20, 40, 30, 30 };
		int dupli = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					dupli++;

					if (dupli == 3) {

						System.out.println("2nd dupli ele is " + a[i]);
						return;
					}
				}

			}

		}

	}

}
