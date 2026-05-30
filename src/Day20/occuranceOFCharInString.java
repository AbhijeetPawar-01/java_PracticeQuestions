package Day20;

public class occuranceOFCharInString {
	public static void main(String[] args) {

		String s = "agresssssion";

		System.out.println(s.length() - 1);

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 's') {
				count = count + 1;

			}

		}
		System.out.println(count);
	}

}
