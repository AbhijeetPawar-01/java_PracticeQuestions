package Day17;

public class primeOrNot {
	public static void main(String[] args) {

		int no = 4;

		int temp = 0;
		for (int i = 1; i <= no; i++) {
			if (no % i == 0) {

				temp++;

			}
		}
		if (temp > 1) {
			System.out.println("not a prime");
		} else
			System.out.println("prime");

	}
}
