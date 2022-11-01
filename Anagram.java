package com.abc.gitadd;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class LongestPalindrom {

	public static boolean isAnagram(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();

		if (a.length() == b.length())

		{
			int[] ar = new int[256];
			int[] br = new int[256];
			for (int i = 0; i < a.length(); i++) {
				ar[(int) a.charAt(i)] += 1;
				br[(int) b.charAt(i)] += 1;
			}
			for (int i = 0; i < 256; i++) {
				if (ar[i] != br[i])
					return false;

			}
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");

	}
}
