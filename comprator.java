package com.abc.gitadd;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Febonaci {

	public static void main(String[] args) {
		Demo d = new Demo();
		TreeSet t = new TreeSet(d);
		t.add(10);
		t.add(20);
		t.add(15);
		t.add(19);
		t.add(17);
		System.out.println(t);

	}
}

class Demo implements Comparator {
	public int compare(Object o1, Object o2) {
		Integer o = (Integer) o1;
		Integer o3 = (Integer) o2;
		if (o > o3) {
			return 1;
		} else if (o < o3) {
			return -1;
		} else {
			return 0;
		}
	}
}
