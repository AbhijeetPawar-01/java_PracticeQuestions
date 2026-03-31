package Day84;

public class evenOddFromArray {
	public static void main(String[] args) {

		int[] a = { 10, 12, 13, 46 };
		int even = 0;
		int odd = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {

				even++;

			} else
				odd++;

		}

		System.out.println(even);

		System.out.println(odd);

	}

}
