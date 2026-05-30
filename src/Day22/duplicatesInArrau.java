package Day22;

public class duplicatesInArrau {
	public static void main(String[] args) {

		int a[] = { 1, 2, 2, 3, 45 };

		boolean flag = false;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length - 1; j++) {

				if (a[i] == a[j]) {

					System.out.println("duplicaties found " + a[i]);
					flag = true;

				}

			}

		}

		if (flag == false) {
			System.out.println("not fo");

		}

	}

}
