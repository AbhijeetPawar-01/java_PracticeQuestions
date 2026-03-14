package Java_Repeat_Practice;

public class PalindromeINT {
	public static void main(String[] args) {

		int num = 1231;
		int rev = 0;
		int org = num;

		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		if (org == rev) {
			System.out.println("pal");
		} else
			System.out.println("no");
	}

}
