package Day22;

public class revEachWord {
	public static void main(String[] args) {

		String s = "welcome yo java autmation";

		String[] words = s.split(" ");

		String revString = " ";

		for (String w : words) {

			String revWord = " ";

			for (int i = w.length() - 1; i >= 0; i--) {

				revWord = revWord + w.charAt(i);

			}

			revString = revString + revWord + "";

		}

		System.out.println(revString);

	}
}
