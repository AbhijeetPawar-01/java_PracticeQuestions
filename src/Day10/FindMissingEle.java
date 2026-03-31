package Day10;

public class FindMissingEle {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 6 };
		int sum = 0;
		int sum1 = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);

		for (int i = 1; i <= 6; i++) {
			sum1 = sum1 + i;
		}
		System.out.println(sum1);

		System.out.println("missing element is " + (sum1 - sum));
	}

}
