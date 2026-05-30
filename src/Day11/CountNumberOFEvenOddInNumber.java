package Day11;

public class CountNumberOFEvenOddInNumber {
	public static void main(String[] args) {

		int a = 1123456678;

		int evenCount = 0;
		int oddCount = 0;

		while (a != 0) {

			int rem = a % 10;
			if (rem % 2 == 0) {
				evenCount++;

			} else {
				oddCount++;
			}

			a = a / 10;

		}
		System.out.println(evenCount);
		System.out.println(oddCount);
	}

}
