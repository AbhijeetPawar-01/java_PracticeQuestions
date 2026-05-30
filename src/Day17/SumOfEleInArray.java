package Day17;

public class SumOfEleInArray {
	public static void main(String[] args) {

		int a[] = { 10, 20, 40, 30 };

		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);

	}

}
