package Day19;

public class findDupli {
	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40 };

		int coun = 0;
		boolean flag = false;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {

					System.out.println(a[i]);
					flag = true;

				}

			}
			if (flag == false) {
				System.out.println("dupli no");
				break;

			}

		}
	}

}
