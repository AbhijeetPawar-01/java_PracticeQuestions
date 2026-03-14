package Array_PracticeQuestions;

public class SumOfEleInArray {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };

		int sum = 0;

//		for (int i = 0; i < a.length; i++) {
//
//			sum = sum + a[i];
//
//		}

		// enhanced loop
		for (int x : a) {
			sum = sum + x;
		}
		System.out.println(sum);

	}

}
