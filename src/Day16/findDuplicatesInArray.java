package Day16;

public class findDuplicatesInArray {
	public static void main(String[] args) {

		int a[] = { 10, 10, 20, 30, 401, 10 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length - 1; j++) {

				if (a[i] == a[j]) {
					System.out.println(a[j]);
				}
			}
		}

	}

}
