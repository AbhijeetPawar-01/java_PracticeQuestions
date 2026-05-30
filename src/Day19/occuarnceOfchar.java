package Day19;

import java.util.HashMap;
import java.util.Map;

public class occuarnceOfchar {
	public static void main(String[] args) {

		String s = "selenium";

		char[] arr = s.toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char c : arr) {

			if (charMap.containsKey(c)) {

				charMap.put(c, charMap.get(c) + 1);

			} else {

				charMap.put(c, 1);

			}
		}
		System.out.println(s + " : " + charMap);
	}

}
