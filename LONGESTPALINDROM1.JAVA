package com.abc.gitadd;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class SortingName {

	public static void main(String[] args) {
		String s = "mymadamisbad";
		String temp = " ";
		int ar = 0;
		String lp = " ";
		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length(); j >= i; j--) {
				temp = s.substring(i, j);
				StringBuilder st = new StringBuilder(temp);
				st.reverse();
				if (temp.equals(new String(st))) {
					if (ar < st.length()) {
						ar = st.length();
						lp = temp;
					}
				}
			}

		}
		System.out.println("LONGEST PALINDROM"+lp);

	}
}
