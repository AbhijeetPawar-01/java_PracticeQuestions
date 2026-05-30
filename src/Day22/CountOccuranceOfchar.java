package Day22;

public class CountOccuranceOfchar {
	public static void main(String[] args) {

		String s = "agressssssion";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 's') {

				count++;

			}
		}

		System.out.println(count);

	}

}
