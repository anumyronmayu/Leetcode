package javaLanguage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class JavaList {

	public static void main(String[] args) {

		// reverse a list
		List<Integer> list = new ArrayList<Integer>();

		list.add(0);
		list.add(1);
		list.add(2);

		Collections.reverse(list);

		System.out.println(list);

		// another example
		ArrayList arrlst = new ArrayList();

		arrlst.add("A");
		arrlst.add("B");
		arrlst.add("C");
		arrlst.add("D");
		arrlst.add("E");

		System.out.println("The initial list is :" + arrlst);

		Collections.reverse(arrlst);

		System.out.println("The Reverse List is :" + arrlst);

	}

}
