package Day22;

public class palindrome {
	public static void main(String[] args) {

		int num = 1211321;
		int rev = 0;

		int org_Num = num;

		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;

		}

		System.out.println("rev is" + rev);

		if (org_Num == rev) {

			System.out.println("num is palindrome");
		}

		else

			System.out.println("num is not palindrome");

	}

}
