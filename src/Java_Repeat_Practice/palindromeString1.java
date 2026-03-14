package Java_Repeat_Practice;

public class palindromeString1 {
	public static void main(String[] args) {

		String s = "madam";
		String rev = "";
		String org = s;
		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);
		}

		if (org.equals(rev)) {
			System.out.println("pal");

		} else
			System.out.println("no");
	}

}
