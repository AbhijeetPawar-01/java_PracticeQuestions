package Day22;

public class primeOrNot {
	public static void main(String[] args) {

		int num = 4;

		int count = 0;

		for (int i = 2; i <= num; i++) {

			if (num % i == 0) {
				count++;
			}

		}

		if (count > 1) {
			System.out.println("not a prime");
		} else

			System.out.println("prime");
	}
}
