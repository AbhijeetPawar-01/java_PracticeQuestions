package Day10;

public class serachingAnArray {
	public static void main(String[] args) {

		int a[] = { 10, 30, 40, 22, 10, 10 };

		int search = 10;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == search) {

				System.out.println("ele found");
				break;
			}

		}

	}

}
