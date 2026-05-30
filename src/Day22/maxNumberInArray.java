package Day22;

public class maxNumberInArray {
	public static void main(String[] args) {

		int a[] = { 10, 345, 20, 30, 40, 1, 45 };
		int max = a[0];
//for max
		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
			}

		}
		System.out.println("max" + max);

//for min

		int min = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] < min) {
				min = a[i];
			}

		}
		System.out.println(min);

	}

}
