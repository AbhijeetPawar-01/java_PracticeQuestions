package Day9;

public class RevEachWord {
	public static void main(String[] args) {

		String str = "Abhijeet is hardworker";

		String[] words = str.split(" ");

		String revsersString = "";

		for (String w : words) {

			String revserseWord = "";

			for (int i = w.length() - 1; i >= 0; i--) {
				revserseWord = revserseWord + w.charAt(i);
			}

			revsersString = revsersString + revserseWord + " ";
		}
		System.out.println(revsersString);
	}

}
