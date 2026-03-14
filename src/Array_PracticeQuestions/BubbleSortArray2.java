package Array_PracticeQuestions;

public class BubbleSortArray2 {

	public static void main(String[] args) {
		int a[] = { 13, 11, 34, 12, 33 };
		int temp;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] > a[j + 1]) {

					temp = a[j]; // 13
					a[j] = a[j + 1]; // a[j+1] = 13
					a[j + 1] = temp; // 13
				}

			}

		}

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}
	}
}
