package Day10;

public class printEvenOdd {
	public static void main(String[] args) {

		int a[] = { 10, 34, 567, 894, 19 };
		System.out.println("even numbers are");
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				System.out.println(a[i]);

			}
		}

		System.out.println("odd numbers are");
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {
				System.out.println(a[i]);

			}
		}
	}

}
