package Day84;

public class FindDuplicates {
	public static void main(String[] args) {

		int a[] = { 13, 35, 56, 67 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {

					System.out.println("dupli is" + a[i]);
				}
			}

		}

	}

}
