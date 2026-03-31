package Day6;

public class DuplicateInArray {
	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 10, 40 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					System.out.println("duplicate value:" + a[i]);

				}

			}

		}

	}
	
}
