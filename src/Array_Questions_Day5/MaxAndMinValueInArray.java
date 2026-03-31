package Array_Questions_Day5;

public class MaxAndMinValueInArray {
	public static void main(String[] args) {

		int[] a = { 10, 40, 20, 50, 90, 70 };

		int max = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {

				max = a[i];

			}

		}

		System.out.println(max);
	}

}
