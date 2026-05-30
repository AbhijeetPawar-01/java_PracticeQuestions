package Day15;

public class FindDuplicatesInArray {
	public static void main(String[] args) {

		int a[] = { 13, 80, 13, 13 };
		boolean flaag = false;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {

					System.out.println(a[j]);
					flaag = true;

				}

			}

		}

		if (flaag == false) {

			System.out.println("dipli mot ");

		}

	}
}
