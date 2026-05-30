package Day22;

public class armstring {

	public static void main(String[] args) {

		int no = 1513;
		int t1 = no;
		int length = 0;

		// find number of digits
		while (t1 != 0) {
			t1 = t1 / 10;
			length++;
		}

		int t2 = no;
		int arm = 0;

		while (t2 != 0) {

			int rem = t2 % 10;

			int mul = 1;

			for (int i = 0; i < length; i++) {

				mul = mul * rem;

			}

			arm = arm + mul;
			t2 = t2 / 10;

		}

		if (no == arm) {
			System.out.println("armstrong");
		}

		else
			System.out.println("not ");
	}

}
