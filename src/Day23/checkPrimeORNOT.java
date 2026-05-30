package Day23;

public class checkPrimeORNOT {

	public static void main(String[] args) {

		int num = 8;
		int temp = 0;

		for (int i = 1; i < num; i++) {

			if (num % i == 0) {

				temp++;
			}

		}

		if (temp > 1) {
			System.out.println("not a prime number");
		} else
			System.out.println("its a prime number");

	}

}
