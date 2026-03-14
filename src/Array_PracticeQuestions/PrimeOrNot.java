package Array_PracticeQuestions;

public class PrimeOrNot {
	public static void main(String[] args) {

		int a = 4;
		int temp = 0;

		for (int i = 0; i <= a; i++) {

			if (a % 2 == 0) {
				temp = temp + 1;

			}

		}

		if (temp > 1) {
			System.out.println("not a prime");
		} else
			System.out.println("prime");
	}

}
