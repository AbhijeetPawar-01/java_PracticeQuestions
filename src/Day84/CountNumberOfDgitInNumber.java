package Day84;

public class CountNumberOfDgitInNumber {

	public static void main(String[] args) {

		int num = 1233452345;

		int ccount = 0;

		while (num != 0) {

			int rem = num % 10;
			ccount++;
			num = num / 10;

		}

		System.out.println(ccount);
	}

}
