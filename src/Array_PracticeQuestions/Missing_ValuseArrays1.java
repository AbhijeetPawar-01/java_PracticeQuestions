package Array_PracticeQuestions;

public class Missing_ValuseArrays1 {
	public static void main(String[] args) {

		int[] a = { 1, 2, 4, 5 };
		int sum = 0;
		int sum1 = 0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];
		}
		System.out.println("Sum is" + sum);

		for (int i = 0; i <= 5; i++) {

			sum1 = sum1 + i;
		}
		System.out.println("Sum1 is" + sum1);

		System.out.println(sum1 - sum);

	}

}
