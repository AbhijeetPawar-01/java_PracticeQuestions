package Day11;

public class Palindromenumber {
	public static void main(String[] args) {

		int a = 12321;
		int rev = 0;
		int oregNum = a;

		while (a != 0) {
			rev = rev * 10 + a % 10;
			a = a / 10;
		}
		System.out.println(rev);
		if (oregNum == rev) {
			System.out.println("int is palindrome");
		} else {

			System.out.println("int is not palindrome");
		}
	}

}
