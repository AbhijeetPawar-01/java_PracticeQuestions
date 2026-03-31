package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ConvertArraysToList {
	public static void main(String[] args) {

		Object[] x = { 22, "String", null, 10 };
		ArrayList li = new ArrayList();
//		Collections.addAll(li, x);
//		System.out.println(li);

		for (Object g : x) {

			li.add(g);
		}

	}

}
