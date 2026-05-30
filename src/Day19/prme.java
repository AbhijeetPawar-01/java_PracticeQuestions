package Day19;

public class prme {
	public static void main(String[] args) {

		int num = 13;

		boolean status = true;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				status = false;

			}
		}

		if (status == true) {
			System.out.println("not a prime");
		}

		else {

			System.out.println("prime");
		}
	}

}
