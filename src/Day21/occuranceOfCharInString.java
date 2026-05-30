package Day21;

public class occuranceOfCharInString {
	public static void main(String[] args) {

		String s = "agresssion";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a') {
				count++;
			}

		}
		System.out.println(count);

	}

}
