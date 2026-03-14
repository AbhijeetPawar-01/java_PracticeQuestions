package Day3practice;

public class PalindromeInt {
	public static void main(String[] args) {

		int num = 1245551;
		int rev = 0;
		int org = num;

		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		System.out.println(rev);

		if (org == rev) {
			System.out.println("palindrome");
		}

		else {
			System.out.println("not palindrome");
		}
	}

}
