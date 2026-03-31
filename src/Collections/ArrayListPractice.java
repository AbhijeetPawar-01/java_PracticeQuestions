package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {
	public static void main(String[] args) {

		ArrayList li = new ArrayList();

		li.add(100);
		li.add('c');
		li.add("Abhijeet");
		li.add(null);
		li.add(100);

		// insert value

		/*
		 * li.add(3, "sameer"); System.out.println(li);
		 * 
		 * li.remove(3); System.out.println(li);
		 * 
		 * li.set(2, "sameer"); System.out.println(li);
		 */

		// Read data from arraylist

		/*
		 * for (int i = 0; i < li.size(); i++) {
		 * 
		 * System.out.println(li.get(i)); }
		 */

		/*
		 * for (Object x : li) { System.out.println(x);
		 * 
		 * }
		 */

		Iterator it = li.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}
	}

}
