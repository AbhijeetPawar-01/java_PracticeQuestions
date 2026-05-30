package Day17;

public class ReverseEachWordFromString {

	public static void main(String[] args) {

		String s = "welcome to selenium";

		String reverString = "";

		String[] word = s.split(" ");

		for (String w : word) {
			String reverWord = " ";
			for (int i = w.length() - 1; i >= 0; i--) {

				reverWord = reverWord + w.charAt(i);
			}
			reverString = reverString + reverWord + " ";
		}

		System.out.println(reverString);
	}

}
