package Day3practice;

public class CountNumberOfDigitInInteger {

	public static void main(String[] args) {

		int num = 123456783;

		int count = 0;

		while (num != 0) {

			num = num / 10;
			count++;
		}
		System.out.println(count);
	}

}
