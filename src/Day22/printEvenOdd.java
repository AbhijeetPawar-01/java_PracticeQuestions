package Day22;

public class printEvenOdd {
	public static void main(String[] args) {
		int sum = 0;
		int a[] = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {

				System.out.println(a[i]);
				sum = sum + a[i];
			}

		}
		System.out.println(sum);
//		System.out.println("odd");
//
//		for (int i = 0; i < a.length; i++) {
//
//			if (a[i] % 2 != 0) {
//
//				System.out.println(a[i]);
//
//			}

	}

}
