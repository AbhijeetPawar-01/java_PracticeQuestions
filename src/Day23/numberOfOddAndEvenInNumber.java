package Day23;

import java.lang.annotation.ElementType;

public class numberOfOddAndEvenInNumber {
	public static void main(String[] args) {

		int num = 1234568;

		int evenCount = 0;
		int oddCount = 0;

		while (num != 0) {

			int rem = num % 10;

			if (rem % 2 == 0) {
				evenCount++;

			} else
				oddCount++;

			num = num / 10;

		}
		System.out.println(evenCount);
		System.out.println(oddCount);
	}

}
