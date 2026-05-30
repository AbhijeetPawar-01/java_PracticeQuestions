package Day15;

public class FindSumOfElementInArray {
	public static void main(String[] args) {

		int a[] = { 10, 30, 20, 40, 50 };

		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];

		}
		System.out.println(sum);
	}
}
