package Array_PracticeQuestions;

public class FindMaxInArray {
	public static void main(String[] args) {

		int[] a = { 12, 34, 65, 34, 89 };

		int max = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {

				max = a[i];
			}

		}

		System.out.println(max);
	}
}
