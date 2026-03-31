package ArrayDay5;

public class FindNumberOfReps {

	public static void main(String[] args) {

		int a[] = { 10, 10, 20, 10, 40 };

		int count = 0;
		int num = 10;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == num) {

				count++;

			}

		}

		System.out.println(count);
	}

}
