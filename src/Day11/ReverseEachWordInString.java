package Day11;

public class ReverseEachWordInString {
	public static void main(String[] args) {

		String str = "Welome to java";

		String[] word = str.split(" ");
		String revString = "";

		for (String w : word) {
			String revWord = "";
			for (int i = w.length() - 1; i >= 0; i--) {

				revWord = revWord + w.charAt(i);

			}
			revString = revString + revWord + " ";

		}
		System.out.println(revString);

	}

}
