package Day21;

public class revEachWodInString {

	public static void main(String[] args) {

		String str = "welcome to java";
		String[] words = str.split(" ");

		String revString = "";

		for (String word : words) {
			String revWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {

				revWord = revWord + word.charAt(i);
			}
			revString = revString + revWord + " ";
		}

		System.out.println(revString);
	}

}
