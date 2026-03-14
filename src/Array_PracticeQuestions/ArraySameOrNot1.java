package Array_PracticeQuestions;

public class ArraySameOrNot1 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, };

		int[] b = { 0, 2, 3, 4, };

// 2 condition 1--> length of array is same or not
//		       2--> compare the a[i]  and b[]i

		boolean status = true;

		if (a.length == b.length) {

			for (int i = 0; i < a.length; i++) {

				if (a[i] != b[i]) {

					status = false;
				}
			}
		} else {
			status = false;
		}

		if (status == true) {
			System.out.println("Equal");
		} else
			System.out.println("not Equal");

	}
}
