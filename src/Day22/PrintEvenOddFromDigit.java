package Day22;

import Day17.evenOddFrmArray;

public class PrintEvenOddFromDigit {
	public static void main(String[] args) {

		int num = 1234568;

		int evneCount = 0;
		int oddCount = 0;

		while (num != 0) {

			int rem = num % 10;

			if (rem % 2 == 0) {
				evneCount++;

			} else {
				oddCount++;
			}

			num = num / 10;

		}

		System.out.println(evneCount);
		System.out.println(oddCount);

	}

}
