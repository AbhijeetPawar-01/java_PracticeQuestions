package Day9;

import java.util.Arrays;

public class ReverseEachWordDFromString {

	public static void main(String[] args) {

		String str = "Welcome To Java";

		// System.out.println("before splitting string =" + str);

		String[] words = str.split(" ");
		String reverseString = " ";

		// System.out.println(Arrays.toString(words));

		for (String w : words) {

			String revwerseWord = " ";
			for (int i = w.length() - 1; i >= 0; i--) {

				revwerseWord = revwerseWord + w.charAt(i);

			}
			reverseString = reverseString + revwerseWord + " ";
		}
		System.out.println(reverseString);

	}

}
