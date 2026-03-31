package Array_Questions_Day5;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesUsingSetInterface {

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3, 4, 5, 5, 5 };

		Set<Integer> s = new HashSet<>();

		for (int x : a) {

			boolean b = s.add(x);

			if (b == false) {
				System.out.println(x);
			}
		}

	}

}
