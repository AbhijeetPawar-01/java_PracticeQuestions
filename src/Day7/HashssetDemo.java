package Day7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashssetDemo {

	public static void main(String[] args) {

		HashSet s = new HashSet();

//		Set s1 = new HashSet();
//
//		HashSet<String> s2 = new HashSet<String>();

		s.add(100);
		s.add(true);
		s.add(null);
		s.add('c');
		s.add("Abhi");
		System.out.println(s);

		// convert hashset oint arraylist

		Set s2 = new HashSet();
		s2.add(101);
		s2.add(true);
		s2.add(null);
		s2.add('v');
		s2.add("Sam");

		ArrayList li = new ArrayList(s2);
		System.out.println("cnvert" + li);
		System.out.println(li.get(0));

	}

}
