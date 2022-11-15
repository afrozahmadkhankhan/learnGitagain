package com.abc.gitadd;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class LongestPalindrom {

	public static void main(String[] args) {

		String s = "mymadamisbad";
		int max = 0;
		String longestPalindrom = " ";
		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length(); j >= i; j--) {
				String temp = s.substring(i, j);
				StringBuilder str = new StringBuilder(temp);
				str.reverse();
				if (temp.equals(new String(str))) {
					if (max < str.length()) {
						max = str.length();
						longestPalindrom = temp;

					}
				}
			}
		}
		System.out.println(longestPalindrom);

	}
}
