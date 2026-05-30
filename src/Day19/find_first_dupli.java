package Day19;

public class find_first_dupli {
	public static void main(String[] args) {

		int a[] = { 10, 10, 20, 30, 20 };
		int tem = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {

					System.out.println("first dupli" + a[i]);
					tem++;
					break;

				}	

			}

			if (tem > 0) {
				break;
			}

		}
	}
}
