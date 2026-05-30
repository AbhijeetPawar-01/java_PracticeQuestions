package Day22;

import java.util.HashSet;

public class dupli1 {
	public static void main(String[] args) {
		boolean flag = false;
		String arr[] = { "java", "c", "c++", "java" };
		HashSet<String> lang = new HashSet();

		for (String a : arr) {

			if (lang.add(a) == false) {

				System.out.println("duplicates are found");
				flag = true;

			}

		}

		if (flag == false) {
			System.out.println("dupli not found");

		}

	}

}
