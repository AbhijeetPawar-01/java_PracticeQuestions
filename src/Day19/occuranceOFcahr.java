package Day19;

public class occuranceOFcahr {
	public static void main(String[] args) {

		String s = "selenium";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'e') {
				count++;

			}

		}
		System.out.println(count);
	}

}
