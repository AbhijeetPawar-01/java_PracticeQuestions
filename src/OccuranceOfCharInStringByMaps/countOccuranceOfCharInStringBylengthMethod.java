package OccuranceOfCharInStringByMaps;

public class countOccuranceOfCharInStringBylengthMethod {
	public static void main(String[] args) {

		String s = "I love accenture";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'u') {
				count++;

			}

		}
		System.out.println(count);

	}
}
