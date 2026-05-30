package Day22;

public class findFirstDupliInArray {
	public static void main(String[] args) {

		int a[] = { 10, 20, 10, 20, 30, 40 };
		boolean flas = false;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					System.out.println("dupli ele is " + a[i]);
					flas = true;
					break;

				}

			}
			if (flas) {
				break;

			}

		}

	}
}
