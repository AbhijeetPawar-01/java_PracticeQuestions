package Day23;

public class maxNumberInArray {
	public static void main(String[] args) {

		int a[] = { 10, 200, 23, 20, 34 };

		int max = a[0];

		for (int i = 0; i < a.length; i++) {

			if (max < a[i]) {

				max = a[i];
			}

		}
		System.out.println(max);

	}

}
