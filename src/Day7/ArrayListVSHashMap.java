package Day7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListVSHashMap {
	public static void main(String[] args) {

		// declarration of arrayList - 3 ways

		ArrayList li = new ArrayList();
		List li1 = new ArrayList();

		ArrayList<String> li2 = new ArrayList<String>();

		// adding data
		li.add(100);
		li.add("Abhi");
		li.add(90);
		li.add('c');
		li.add(null);

		System.out.println(li);

		li.add(4, 15);
		System.out.println(li);

		li.set(0, 101);
		System.out.println(li);

//		for (int i = 0; i < li.size(); i++) {
//
//			System.out.println(li.get(i));
//
//		}

		/*
		 * for(Object x : li) {
		 * 
		 * System.out.println(x); }
		 */

		/*
		 * Iterator it = li.iterator();
		 * 
		 * while (it.hasNext()) {
		 * 
		 * System.out.println(it.next());
		 * 
		 * }
		 */

		// convert ArrayList int hashSet

		/*
		 * HashSet s1 = new HashSet(li); System.out.println("Convert" + s1);
		 */

		// HASHSET
		// Declaration

		HashSet hash = new HashSet();

		Set hash1 = new HashSet();
		HashSet<String> map = new HashSet<String>();
		hash.add(12);
		hash.add(true);
		hash.add(null);
		hash.add("Abhia");
		hash.add('c');

		// read all the data

		/*
		 * for(Object x : hash) {
		 * 
		 * System.out.println("haset" + x); }
		 */

		// using iterator

		/*
		 * Iterator it1 = hash.iterator();
		 * 
		 * while (it1.hasNext()) {
		 * 
		 * System.out.println(it1.next());
		 * 
		 * }
		 */

		// convert hashset into ArrayList
		ArrayList arr = new ArrayList(hash);
		System.out.println("Arralist is " + arr);

		System.out.println(arr.get(0));

	}

}
