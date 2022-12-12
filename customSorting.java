package com.abc.gitadd;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class SortingName {

	public static void main(String[] args) {
		Demo d = new Demo();
		TreeSet t = new TreeSet(d);
		t.add(1);
		t.add(5);
		t.add(2);
		t.add(4);
		System.out.println("Sorting order by custom" + t);

	}

}

class Demo implements Comparator {
	public int compare(Object o1, Object o2)

	{
		Integer o3 = (Integer) o1;
		Integer o4 = (Integer) o2;

		if (o3 > o4) {
			return 1;
		} else if (o3 < o4) {
			return -1;
		} else {
			return 0;
		}
	}
}
