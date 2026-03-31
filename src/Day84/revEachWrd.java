package Day84;

public class revEachWrd {
	public static void main(String[] args) {

		String str = "welcome to java";

		String[] words = str.split(" ");

		String rev = "";
		String revString = "";
		for (String w : words) {

			for (int i = w.length() - 1; i >= 0; i--) {
				rev = rev + w.charAt(i);
			}
		}
		System.out.println(rev);
		revString = revString + rev;
	}

}
