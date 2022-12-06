package com.abc.gitadd;

import java.util.Scanner;

public class LongestPlaindram {

	public static void main(String[] args) {

		String s = "mymadamisbad";
		String temp = " ";
		int max = 0;
		String lp = " ";
		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length() - 1; j > i; j--) {
				temp = s.substring(i, j);
				StringBuffer str = new StringBuffer(temp);
				str.reverse();
				if (temp.equals(new String(str))) {
					if (max < str.length()) {
						max = temp.length();
						lp = temp;

					}
				}
			}
		}
		System.out.println("Longest Palindram"+lp);
	}
}
