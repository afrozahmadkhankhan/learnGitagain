package com.abc.gitadd;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class SortingName {

	public static void main(String[] args) {

		String s = "abcdefghijklmnopqrstuvwxyz";
		int[] ar = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int index = (int) s.charAt(i) - 97;
			ar[index] = ar[index] + 1;
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] <= 0) {
				System.out.println("this is not the panagram");
				System.exit(i);
			}

		}
		System.out.println("This is the panagram");
	}
}
