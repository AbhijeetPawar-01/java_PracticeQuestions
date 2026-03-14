package Array_PracticeQuestions;

public class FindMaxInArray2 {

	public static void main(String[] args) {

		int a[] = { 12, 34, 56, 1, 28 };

		int max = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {

				max = a[i];

			}

		}
		System.out.println(max);

	}

}
