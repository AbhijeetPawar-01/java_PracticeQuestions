package Day17;

public class countNumberOfDigitsInNumber {
	public static void main(String[] args) {

		int num = 12345111;
		int count = 0;

		while (num != 0) {

			int rem = num % 10;
			count++;
			num = num / 10;

		}
		System.out.println(count);

	}

}
