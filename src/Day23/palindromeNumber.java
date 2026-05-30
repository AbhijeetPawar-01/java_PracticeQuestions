package Day23;

public class palindromeNumber {
	public static void main(String[] args) {

		int num = 1232111;
		int orgNum = num;
		int rev = 0;

		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;

		}

		System.out.println(rev);

		if (orgNum == rev) {
			System.out.println("number is palindrome");

		} else {

			System.out.println("Number is not palindrome");
		}
	}

}
