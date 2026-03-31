package Day7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(100);
		list.add("Abhi");
		list.add("Abhi");
		list.add(null);
		list.add(null);
		list.add(101);
		list.add(100);

		System.out.println(list.size());

		System.out.println(list);

		// remove the specfic ele
		list.remove(5);
		System.out.println("After removing" + list);

		// insertion/add/replace

		list.add(2, "Mohan");
		System.out.println("After inserting..." + list);

		list.set(1, 201);
		System.out.println("After update..." + list);

		// reading all the data

//		for (int i = 0; i < list.size(); i++) {
//
//			System.out.println(list.get(i));
//
//		}

		// for each loop
//		for (Object x : list) {

//			System.out.println(x);
//		}

		// iterator

//		Iterator it = list.iterator();
//
//		while (it.hasNext()) {
//
//			System.out.println(it.next());
//
//		}

		// convert ArrayList to HashSet

		List mylist1 = new ArrayList();

		mylist1.add(100);
		mylist1.add("Abhi");
		mylist1.add(1001);
		mylist1.add('c');
		mylist1.add(100);

		HashSet<Object> hash = new HashSet<>(mylist1);
		System.out.println(hash);

	}

}
