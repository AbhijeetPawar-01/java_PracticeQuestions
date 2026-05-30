package Day23;

public class SumOFeleInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 1 };
		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];

		}
		System.out.println(sum);

	}

}
