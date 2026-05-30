package Day15;

public class FindMissingeleInArray {
	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 5, 6 };

		int sum = 0;
		int sum1 = 0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];

		}
		System.out.println("array" + sum);

		for (int i = 1; i <= 6; i++) {

			sum1 = sum1 + i;

		}
		System.out.println(sum1);

		System.out.println("missing ele is " + (sum1 - sum));

	}

}
