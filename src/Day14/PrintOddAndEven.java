package Day14;

public class PrintOddAndEven {
	public static void main(String[] args) {

		int num = 123456;
		int temp = num;

		while (temp != 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				System.out.println("even" + rem);
			}
			num = num / 10;

		}

		while (temp != 0) {
			int rem = num % 10;
			if (rem % 2 != 0) {
				System.out.println("odd" + rem);
			}
			num = num / 10;

		}

	}
}
