package Day17;

public class findDuplicatedInArray {

	public static void main(String[] args) {

		int a[] = { 10, 10, 102, 20, 20, 30 };

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				System.out.println(a[i]);

			}
		}

	}

}
