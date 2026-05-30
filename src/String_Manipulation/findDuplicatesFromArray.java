package String_Manipulation;

public class findDuplicatesFromArray {
	public static void main(String[] args) {

		String[] str = { "java", "java", "selenium", "python", "selenium" };

		for (int i = 0; i < str.length; i++) {

			for (int j = i + 1; j < str.length; j++) {

				if (str[i] == str[j]) {

					System.out.println("duplicates string :" + str[i]);
				}

			}

		}

	}

}
