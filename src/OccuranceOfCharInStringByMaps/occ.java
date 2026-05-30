package OccuranceOfCharInStringByMaps;

public class occ {
	public static void main(String[] args) {

		String s = "welecome to selenium";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 's') {
				count++;

			}
		}
		System.out.println(count);
	}

}
