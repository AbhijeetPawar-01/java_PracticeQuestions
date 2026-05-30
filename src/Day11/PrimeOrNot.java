package Day11;

public class PrimeOrNot {

	public static void main(String[] args) {

		int a = 3;
		int temp = 0;

		for (int i = 1; i < a; i++) {

			if (a % i == 0) {

				temp = temp + 1;

			}

		}
		System.out.println(temp);

		if (temp > 1) {
			System.out.println("not a prime");

		} else {
			System.out.println("prime number");
		}

	}

}
