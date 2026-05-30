package String_Manipulation;

public class DuplicatesCharInArray {
	public static void main(String[] args) {

		String str = "Welcome to java selenium";

		char[] ch = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {

			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j]) {

					System.out.println("dupliates char are : " + ch[j]);

					count++;
				}

			}

		}

	}

}
