package OccuranceOfCharInStringByMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class dupliInStringMap {
	public static void main(String[] args) {

		String s = "Welcometojavaselenium";

		if (s.length() == 1) {
			System.out.println("single");
		}
		if (s.isEmpty()) {
			System.out.println("empty");
		}

		char[] word = s.toCharArray();

		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		for (Character ch : word) {

			if (charmap.containsKey(ch)) {
				charmap.put(ch, charmap.get(ch) + 1);

			} else {
				charmap.put(ch, 1);
			}

		}

		Set<Map.Entry<Character, Integer>> entryset = charmap.entrySet();

		for (Map.Entry<Character, Integer> entry : entryset) {

			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());

			}

		}

	}

}
