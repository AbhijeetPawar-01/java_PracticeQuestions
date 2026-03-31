package Day6;

public class LinearSearch {
	public static void main(String[] args) {

		int a[] = { 10, 201, 300, 40 };
		int search = 20;
		boolean status = false;

		for (int i = 0; i < a.length; i++) {

			if (search == a[i]) {

				System.out.println("ele fond at " + i);
				status = true;

			}

		}
		if (status == false) {
			System.out.println("ele not found");
		}
	}

}
