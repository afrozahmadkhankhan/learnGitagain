package com.abc.gitadd;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class SortingName {

	public static void main(String[] args) {

		String s1 = "ACT";
		String s2 = "CAAT";
		boolean list = solve(s1, s2);
		System.out.println((list) ? "anagram" : "pangarm");

	}

	public static boolean solve(String p1, String p2) {
		p1 = p1.toLowerCase();
		p2 = p2.toLowerCase();
		if (p1.length() == p2.length()) {
			int[] ar = new int[26];
			int[] br = new int[26];
			for (int i = 0; i < p1.length(); i++) {
				int index1 = p1.charAt(i) - 97;
				ar[index1] = ar[index1] + 1;

				int index2 = p2.charAt(i) - 97;
				br[index2] = br[index2] + 1;

			}
			for (int i = 0; i < ar.length; i++) {
				if (ar[i] != br[i]) {
					return false;
				} else {
					return true;
				}
			}
		}

		return false;
	}
}
