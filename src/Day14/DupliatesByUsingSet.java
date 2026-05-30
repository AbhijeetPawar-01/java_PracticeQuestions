package Day14;

import java.util.HashSet;
import java.util.Set;

public class DupliatesByUsingSet {
	public static void main(String[] args) {

		int a1[] = { 10, 20, 10, 45, 56, 20, 10 };

		Set<Integer> hm = new HashSet();

		for (int a : a1) {

			if (hm.add(a) == false) {
				System.out.println(a);

			}

		}
	}

}
