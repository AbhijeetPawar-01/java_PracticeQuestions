package Array_Questions_Day5;

public class FindDuplicateValueinArrayString {
	public static void main(String[] args) {

		String a[] = { "abhi", "sam", "Abhi", "Mohan" };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {

					System.out.println("duplicates are " + a[j]);
				}

			}

		}

	}

}
