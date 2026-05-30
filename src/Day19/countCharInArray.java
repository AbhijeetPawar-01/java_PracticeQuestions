package Day19;

public class countCharInArray {
	public static void main(String[] args) {

		String s = "wecolne to jaava";
		char ch[] = s.toCharArray();
		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a') {
				count++;

			}
		}
		System.out.println(count);

	}
}
