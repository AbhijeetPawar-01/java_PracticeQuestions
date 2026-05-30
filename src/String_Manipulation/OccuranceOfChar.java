package String_Manipulation;

public class OccuranceOfChar {
	public static void main(String[] args) {

		String str = "welcome to selenium";

		int count = 0;
		/*
		 * char[] a = str.toCharArray();
		 * 
		 * for (int i = 0; i < a.length; i++) {
		 * 
		 * if (a[i] == 'e') { count++; }
		 * 
		 * } System.out.println(count);
		 */

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch == 'e') {
				count++;

			}

		}
		System.out.println(count);

	}

}
