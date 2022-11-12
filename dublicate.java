package com.abc.gitadd;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class LongestPalindrom {

	public static void main(String[] args) {

		String s = "abcdefghh";
		int[] ar = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int index = (int) s.charAt(i) - 97;
			ar[index] = ar[index] + 1;

		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > 1) {
				System.out.println((char) (i + 97) + " " + ar[i]);
			}

		}

	}
}
