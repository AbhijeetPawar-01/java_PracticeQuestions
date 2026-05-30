package Day21;

public class maxandMinInArray {

	public static void main(String[] args) {

		int a[] = { 12, 617, 34, 98, 102 };
		int max = a[0];

		for (int i = 0; i < a.length; i++) {

			if (max < a[i]) {

				max = a[i];

			}
		}
		System.out.println(max);

	}

}
