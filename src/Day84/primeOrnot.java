package Day84;

public class primeOrnot {

	public static void main(String[] args) {

		int num = 12;
		int temp = 0;
		for (int i = 1; i < 3; i++) {

			if (num % i == 0) {

				temp = temp + 1;

			}

		}
		if (temp > 1) {
			System.out.println("not priem");

		} else
			System.out.println("prime");
	}

}
