package Day12;

public class RevEachWoedInString {
	public static void main(String[] args) {

		String str = "welcome to java";
		String[] word = str.split(" ");

		String revS = "";

		for (String w : word) {

			String revWord = "";

			for (int i = w.length() - 1; i >= 0; i--) {
				revWord = revWord + w.charAt(i);
			}
			revS = revS + revWord + " ";

		}
		System.out.println(revS);
	}

}
