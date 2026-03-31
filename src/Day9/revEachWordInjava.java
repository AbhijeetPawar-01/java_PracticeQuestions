package Day9;

public class revEachWordInjava {
	public static void main(String[] args) {

		String str = "Welcome to java";

		String[] s = str.split(" ");
		String revString = "";
		for (String x : s) {
			String revWord = "";
			for (int i = x.length() - 1; i >= 0; i--) {

				revWord = revWord + x.charAt(i);

			}

			revString = revString + revWord + "";
		}
		System.out.println(revString);

	}

}
