package Day22;

public class duplu {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		boolean status = false;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {

					System.out.println("duplicate ele is " + a[i] + " " + "found at " + i);

					status = true;

				}

			}

		}
		if (status == false) {

			System.out.println("dupli not found");
		}
	}

}
