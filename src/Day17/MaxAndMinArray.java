package Day17;

public class MaxAndMinArray {
	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50, 10, 80 };
		int max = a[0];

		/*
		 * for (int x : a) {
		 * 
		 * if (x > max) {
		 * 
		 * max = x;
		 * 
		 * }
		 * 
		 * } System.out.println(max);
		 */

		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {

				max = a[i];
			}

		}
		System.out.println(max);
	}

}
