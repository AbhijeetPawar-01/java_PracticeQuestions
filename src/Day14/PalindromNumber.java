package Day14;

public class PalindromNumber {

	public static void main(String[] args) {
		int num = 121321;
		int rev = 0;
		int orgNum = num;

		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		System.out.println(rev);

		if (orgNum == rev) {
			System.out.println("number is palindrome");

		} else {
			System.out.println("number is not palindrome");
		}

	}

}
