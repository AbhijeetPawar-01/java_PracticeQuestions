package Day22;

public class find_XORMehodForSignleAppearInArray {

	public static void main(String[] args) {

		int a[] = { 10, 10, 20, 20, 30, 30, 7 };

		int res = 0;

		for (int i = 0; i < a.length; i++) {

			res = res ^ a[i];

		}
		System.out.println(res);
	}

}
