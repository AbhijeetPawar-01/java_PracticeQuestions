package Day11;

public class SumOfDigitInNumber {
	public static void main(String[] args) {

		int num = 123451;
		int sum = 0;

		while (num != 0) {

			sum = sum + num % 10;
			num = num / 10;

		}
		System.out.println(sum);

	}

}
