package Day6;

public class CountNumberOfDigitsInNumber {

	public static void main(String[] args) {

		int num = 13454555;
		int count = 0;

		while (num != 0) {

			int rem = num % 10;
			count++;

			num = num / 10;

		}

		System.out.println(count);
	}

}
