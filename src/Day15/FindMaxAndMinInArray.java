package Day15;

public class FindMaxAndMinInArray {

	public static void main(String[] args) {

		int a[] = { 12, 356, 47, 479 };

		int max = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {

				max = a[i];
			}

		}
		System.out.println(max);

	}

}
