package Day12;

public class RevEachWord {
	public static void main(String[] args) {

		String str = "Welcome to java";
		String[] word = str.split(" ");

		String revSring = "";

		for (String w : word) {

			String revWord = "";

			for (int i = w.length() - 1; i >= 0; i--) {

				revWord = revWord + w.charAt(i);

			}
			revSring = revSring + revWord + " ";

		}
		System.out.println(revSring);

	}

}
