package OccuranceOfCharInStringByMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccuranceOfCharInStringByMaps {

	public static void main(String[] args) {

		String s = "Java";

		if (s.isEmpty()) {
			System.out.println("String is empty");

		}
		if (s.length() == 1) {
			System.out.println("string is single");

		}

		char[] word = s.toCharArray();

		Map<Character, Integer> Charmap = new HashMap<Character, Integer>();
		for (Character ch : word) {
			if (Charmap.containsKey(ch)) {

				Charmap.put(ch, Charmap.get(ch) + 1);

			} else {

				Charmap.put(ch, 1);

			}
		}

		Set<Map.Entry<Character, Integer>> entrySet = Charmap.entrySet();

		for (Map.Entry<Character, Integer> entry : entrySet) {

			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + "" + entry.getValue());

			}

		}

	}

}
