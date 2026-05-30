package Day17;

public class PalindromeNumber {
	public static void main(String[] args) {

		int num = 1232111;
		int no = num;

		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		System.out.println(rev);

		if (no == rev) {

			System.out.println("palindrome");

		} else
			System.out.println("not a palindrome");
	}

}
