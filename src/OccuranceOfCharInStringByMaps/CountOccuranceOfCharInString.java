package OccuranceOfCharInStringByMaps;

public class CountOccuranceOfCharInString {

	public static void main(String[] args) {

		String s = "i love accenture";
		int count = 0;

		char[] word = s.toCharArray();

		for (char ch : word) {

			if (ch == 'e') {
				count++;

			}

		}
		System.out.println(count);

	}

}
