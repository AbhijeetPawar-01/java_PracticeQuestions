package Day22;

public class findDuplifrom2Array {
	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40 };
		int b[] = { 1, 0, 1, 3, 4, };
		boolean flag = false;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {

				if (a[i] == b[j]) {
					flag = true;

					System.out.println("found" + a[i]);
				}

			}

		}

		if (flag == false) {
			System.out.println("not found");
		}

	}
}
