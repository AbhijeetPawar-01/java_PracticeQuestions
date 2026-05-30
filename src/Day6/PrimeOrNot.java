package Day6;

public class PrimeOrNot {
	public static void main(String[] args) {

		int num = 12;
		int temp = 0;

		for (int i = 1; i < num; i++) {

			if (num % i == 0) {

				temp = temp + 1;

			}

		}
		if (temp > 1) {

			System.out.println("not prime");
		}

		else
			System.out.println("number is prime");
	}

}
