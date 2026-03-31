package Day10;

public class DuplicatesInArray {
	public static void main(String[] args) {
		int a[] = { 10, 10, 10, 30, 45, 10, 10 };
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					System.out.println("dupli ele ares" + a[i]);
					flag = true;
					break;
				}

			}

		}

		if (flag == false) {
			System.out.println("no dupli");
		}

	}
}
