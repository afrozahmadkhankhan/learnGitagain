package com.abc.gitadd;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class LongestPalindrom {

	public static boolean isAnagram(String a, String b) {
		String s = a.toLowerCase();
		String s1 = b.toLowerCase();
		if (s.length() == s1.length()) {
			int[] ar = new int[26];
			int[] ar1 = new int[26];
			for (int i = 0; i < a.length(); i++) {
				int index1 = (int) s.charAt(i) - 97;
				ar[index1] = ar[index1] + 1;
				int index2 = (int) s1.charAt(i) - 97;
				ar1[index2] = ar1[index2] + 1;
			}
			for (int i = 0; i < ar.length; i++) {
				if (ar[i] != ar1[i]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		boolean res = isAnagram(a, b);
		System.out.println((res) ? true : false);

	}
}
