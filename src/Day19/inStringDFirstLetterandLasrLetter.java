package Day19;

public class inStringDFirstLetterandLasrLetter {

	public static void main(String[] args) {

		String s = "java test automation";

		String[] words = s.split(" ");

		String firstLetters = "";
		String lastLetters = "";

		for (String word : words) {

			firstLetters = firstLetters + word.charAt(0); // add first letter
			
			lastLetters = lastLetters + word.charAt(word.length() - 1);
		}
		System.out.println("First letters: " + firstLetters); // jta
		System.out.println("Last letters: " + lastLetters);

	}

}
