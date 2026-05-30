package OccuranceOfCharInStringByMaps;

public class dupliInArray {
	public static void main(String[] args) {

		int no[] = { 10, 20, 10, 20, 10 };

		for (int i = 0; i < no.length - 1; i++) {

			if (no[i] == no[i + 1]) {
				System.out.println(no[i]);
			}

		}

	}
}
