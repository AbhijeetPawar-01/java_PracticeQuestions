package Day19;

public class duplicatesinarray {
	public static void main(String[] args) {

		int a[] = { 3, 2, 3, 4, 5 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if ((a[i] == a[j] && i != j)) {

					System.out.println(a[1]);
				}

			}

		}
	}

}
