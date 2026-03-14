package Array_PracticeQuestions;

public class EvenOddInArray {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 5, 6, 7 };

		int evenCount = 0;
		int oddCount = 0;

//		for (int i = 0; i < a.length; i++) {
//
//			if (a[i] % 2 == 0) {
//
//				evenCount++;
//
//			} else {
//
//				oddCount++;
//			}
//		}

		for (int x : a) {

			if (x % 2 == 0) {
				evenCount++;
			} else {

				oddCount++;
			}
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
	}

}
