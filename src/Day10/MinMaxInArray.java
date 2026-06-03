package Day10;

public class MinMaxInArray {
	public static void main(String[] args) {

		int a[] = { 10, 12, 11, 122, 678, 1234 };

		int max = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {

				max = a[i];
System.out.println();
			}

		}

		System.out.println(max);
	}

}
