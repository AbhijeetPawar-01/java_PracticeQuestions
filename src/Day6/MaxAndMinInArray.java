package Day6;

public class MaxAndMinInArray {
	public static void main(String[] args) {

		int a[] = { 10, 20, 60, 20 };

		int max = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {

				max = a[i];

			}

		}
		System.out.println(max);

	}
}
