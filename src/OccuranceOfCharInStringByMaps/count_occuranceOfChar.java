package OccuranceOfCharInStringByMaps;

public class count_occuranceOfChar {
	public static void main(String[] args) {

		String s = "welcome";
		int count = 0;
		char[] arr = s.toCharArray();

		for (Character w : arr) {

			if (w.equals('E')) {

				count++;

			}

		}
		System.out.println(count);

	}

}
