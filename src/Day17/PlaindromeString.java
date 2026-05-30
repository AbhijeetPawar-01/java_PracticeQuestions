package Day17;

public class PlaindromeString {
	public static void main(String[] args) {

		String s = "mqadam";
		String rev = "";
		String act = s;
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		System.out.println(rev);

		if (act.equals(rev)) {
			System.out.println("palindrome");

		} else
			System.out.println("noy palindrome");
	}
}
