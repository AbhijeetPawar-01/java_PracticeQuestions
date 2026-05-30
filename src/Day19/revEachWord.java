package Day19;

public class revEachWord {
	public static void main(String[] args) {

		String s = "welcome to capgi";

		String[] word = s.split(" ");

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
