package Day22;

public class countWordsiNString {
	public static void main(String[] args) {

		String s = "java to qutomation  hexaware";

		int count = 1;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == ' ' && (s.charAt(i + 1) != ' ')) {
				count++;

			}

		}
		System.out.println(count);
	}

}
