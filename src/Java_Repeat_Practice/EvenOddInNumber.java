package Java_Repeat_Practice;

public class EvenOddInNumber {

	public static void main(String[] args) {

		int n = 123456;
		int rem = 0;
		int even = 0;
		int odd = 0;

		while (n != 0) {

			rem = n % 10;
			if (rem % 2 == 0) {
				even++;

			} else {

				odd++;
			}

			n = n / 10;

		}
		System.out.println(even);
		System.out.println(odd);

	}

}
