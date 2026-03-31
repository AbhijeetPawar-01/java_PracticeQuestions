package Day10;

public class EvenOddFromArray {
	public static void main(String[] args) {

		int a[] = { 12, 11, 24, 57, 789 };
		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				evenCount++;

			} else

				oddCount++;

		}
		System.out.println(evenCount);
		System.out.println(oddCount);
	}

}
